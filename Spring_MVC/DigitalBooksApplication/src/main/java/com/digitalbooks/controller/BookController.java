package com.digitalbooks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public List<Book> getAllBooks() {
		List<Book> bookList = bookService.getAllBooks();
		return bookList;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Integer id) {
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("book is deleted" ,HttpStatus.OK);
		try {
			bookService.deleteBook(id);

		} catch (Exception e) {
			e.printStackTrace();

			responseEntity = new ResponseEntity<String>("Book id not found" ,HttpStatus.NOT_FOUND);

		}

		return responseEntity;

	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateBook(@PathVariable Integer id , @RequestBody Book book){
		
		ResponseEntity<String> responseEntity = new ResponseEntity<String>("book is updated" ,HttpStatus.OK);
		try {
			bookService.updateBook(id, book);

		} catch (Exception e) {
			e.printStackTrace();

			responseEntity = new ResponseEntity<String>("Book id not found" ,HttpStatus.NOT_FOUND);

		}

		return responseEntity;

	}
	
	@GetMapping("/search")
	public ResponseEntity<Book> searchBook(@RequestParam("category") String category,@RequestParam("author") String author
			,@RequestParam("publisher") String publisher) {
		Book bookFound = bookService.searchBook(category, author ,publisher);
		if(bookFound != null) {
			return new ResponseEntity<Book>(bookFound, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Book>(bookFound, HttpStatus.NO_CONTENT);
		}
		
		
	}
	
	@PostMapping("/buy")
	public String buyBook(@RequestBody Book book) {
		Book newBook = bookService.buyBook(book);
		return "subscription_id :"+newBook.getSubscriptionId();
	}
	
	
	@GetMapping("/sample")
	public String sample (@RequestParam("category") String category) {
		
		return category;
		
		
	}
	

}
