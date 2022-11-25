package com.digitalbooks.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.digitalbooks.entity.Book;

public interface IBookService {
	
	public Book saveBook(Book book);
	
	public List<Book> getAllBooks();
	
	public void deleteBook(Integer id);
	
	public Book updateBook(Integer id ,Book book);
	
	public Book searchBook(String category,String author ,String publisher);
	
	public Book buyBook(Book book);

}
