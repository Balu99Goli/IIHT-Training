package com.digitalbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalbooks.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, String> {

}
