package com.digitalbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.entity.Book;
import com.digitalbooks.service.BookService;

@RestController
@RequestMapping("/api/v1/digitalbooks/books")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping("/savebook")
	public Book saveBook(@RequestBody Book book) {
		Book book1 = bookService.saveBook(book);
		return book1;
	}
	
	@GetMapping("/getallbooks")
	public List<Book> getAllBooks(){
		List<Book> bookList = bookService.getAllBooks();
		return bookList;
	}

}
