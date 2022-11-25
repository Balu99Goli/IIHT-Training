package com.digitalbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalbooks.entity.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer>{

}
