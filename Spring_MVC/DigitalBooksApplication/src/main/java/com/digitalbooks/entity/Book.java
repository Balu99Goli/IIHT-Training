package com.digitalbooks.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	private String title;
	private String category;
	private String author;
	private Double price;
	private String logo;
	private String publisher;
	private String publishedDate;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public Book(String title, String category, String author, Double price, String logo, String publisher,
			String publishedDate) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
		this.price = price;
		this.logo = logo;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
	}
	
	
	public Book(Integer bookId, String title, String category, String author, Double price, String logo,
			String publisher, String publishedDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.category = category;
		this.author = author;
		this.price = price;
		this.logo = logo;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
	}
	public Book() {
		super();
	}
	
	
	  

}
