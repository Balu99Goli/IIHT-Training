package com.digitalbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalbooks.entity.Reader;

@Repository
public interface ReaderRepo extends JpaRepository<Reader, Integer> {

}
