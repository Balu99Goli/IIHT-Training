package com.token.utillity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;

//import com.sun.org.apache.xml.internal.security.algorithms.SignatureAlgorithm;

import io.jsonwebtoken.Jwts;

@Component
public class JWTUtillity implements Serializable {
	
	private static final long serialVersionUID= 234523423L;
	
	private static final long JWT_TOKEN_VALIDITY = 5 * 30 * 30 ;
	
	@Value("$(jwt.secret)")
	private String secretKey = "kishan123";
	
	//retrieve the user name from token
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims::getSubject);
	}
	
	//retrieve expiration date from jwt token
	public Date getExpirationDateFromToken(String token) {
		return getClaimFromToken(token , Claims::getExpiration);
		
	}
	
	//to get the claim from the token
	public<T> T getClaimFromToken(String token,Function <Claims, T> claimsResolver) {
		final Claims claims = getAllClaimsFromToken(token);
		return claimsResolver.apply(claims);
		
	}
	
	//for retrieving any information from token
	public Claims getAllClaimsFromToken(String token) {
		return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
		
	}
	
	// to check if the token is expired
	public Boolean isTokenExpired(String token) {
		final Date expiration = getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}
	
	//generate a token for the user
	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<>();
		return doGenerateToken(claims, userDetails.getUsername());
	}

	private String doGenerateToken(Map<String, Object> claims, String subject) {
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
				.signWith(io.jsonwebtoken.SignatureAlgorithm.HS512 ,secretKey).compact();

	}
	
	//to validate the token
	public Boolean validateToken(String token, UserDetails userDetails) {
		final String userName = getUsernameFromToken(token);
		return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
	

	
}
