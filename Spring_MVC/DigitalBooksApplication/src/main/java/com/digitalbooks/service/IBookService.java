package com.digitalbooks.service;

import java.util.List;

import com.digitalbooks.entity.Book;

public interface IBookService {
	
	public Book saveBook(Book book);
	
	public List<Book> getAllBooks();

}
