package com.digitalbooks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.entity.Book;
import com.digitalbooks.repository.BookRepo;

@Service
public class BookService implements IBookService {

	@Autowired
	BookRepo bookRepo;
	
	@Override
	public Book saveBook(Book book) {
		Book book1 = bookRepo.save(book);

		return book1;
	}

	@Override
	public List<Book> getAllBooks() {

		List<Book> bookList = bookRepo.findAll();
		return bookList;
	}
	

}
