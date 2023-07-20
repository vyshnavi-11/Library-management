package com.srkr.library.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srkr.library.entity.Book;
import com.srkr.library.exception.BookNotFoundException;
import com.srkr.library.repository.BookRepository;

@RestController
@CrossOrigin("http://localhost:3000")
//@RequestMapping("/project/api")
public class AdminController {

	@Autowired
	private BookRepository bookRepository;

	@PostMapping("/book")
	Book newBook(@RequestBody Book newBook) {
		return bookRepository.save(newBook);
	}

	@GetMapping("/books")
	List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@GetMapping("/book/{id}")
	Book getBookById(@PathVariable Long id) {
		return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
	}

	@PutMapping("/book/{id}")
	Book updateBook(@RequestBody Book newBook, @PathVariable Long id) {
		return bookRepository.findById(id).map(book -> {
			book.setBname(newBook.getBname());
			book.setAuthor(newBook.getAuthor());
			book.setDescription(newBook.getDescription());
			book.setGenre(newBook.getGenre());
			return bookRepository.save(book);
		}).orElseThrow(() -> new BookNotFoundException(id));
	}

	@DeleteMapping("/book/{id}")
	String deleteBook(@PathVariable Long id) {
		if (!bookRepository.existsById(id)) {
			throw new BookNotFoundException(id);
		}
		bookRepository.deleteById(id);
		return "User with id " + id + " has been deleted success.";
	}
}
