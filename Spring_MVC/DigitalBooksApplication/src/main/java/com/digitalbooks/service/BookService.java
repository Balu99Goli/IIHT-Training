package com.digitalbooks.service;

import java.sql.Timestamp;
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

	@Override
	public void deleteBook(Integer id) {
		bookRepo.deleteById(id);
		
	}

	@Override
	public Book updateBook(Integer id ,Book book) {
		Book existingBook = bookRepo.findById(id).get();
		existingBook.setAuthor(book.getAuthor());
		existingBook.setCategory(book.getCategory());
		existingBook.setLogo(book.getLogo());
		existingBook.setPrice(book.getPrice());
		existingBook.setPublishedDate(book.getPublishedDate());
		existingBook.setPublisher(book.getPublisher());
		existingBook.setTitle(book.getTitle());
		bookRepo.save(existingBook);
		return existingBook;
	}

	@Override
	public Book searchBook(String category, String author,String publisher) {

		List<Book> bookList = bookRepo.findAll();
		for(Book book1:bookList) {
			if(book1.getCategory().equals(category) && book1.getAuthor().equals(author) 
					&& book1.getPublisher().equals(publisher)) {
				return book1;
			}
		}
		return null;
	}

	@Override
	public Book buyBook(Book book) {
		Book book2 = book;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		book2.setSubscriptionId("Date_"+timestamp);
		book2.setInvoiceId("Invoice"+(book2.getSubscriptionId()));
		bookRepo.save(book2);
		return book2;

		
	}
	

}
