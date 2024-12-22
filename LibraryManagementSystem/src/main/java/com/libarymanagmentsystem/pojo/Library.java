package com.libarymanagmentsystem.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.libarymanagmentsystem.daoimpl.BookDaoService;

@Component
public class Library {

	@Autowired
	private BookDaoService service;
	
	private List<Book>books;

	public Library(List<Book> books) {
		super();
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void addBook(Book book) {
		service.addNewBook(book);
		System.out.println("Books added :--"+book);
	}
	
	public void updateBook(Book book) {
		service.updateBook(book);
		System.out.println("Book updated"+book);
	}
	
	public void deleteBook(int id) {
		service.deleteBook(id);
	}
	
	public Book findBook(int id) {
		Book book=service.findBook(id);
		return book;
	}
	
	public List<Book> findAllBook(){
		List<Book>books=service.findAllBook();
		return books;
	}
	
	public Book findBookByTittle(String tittle) {
		Book book=service.findBookByTittle(tittle);
		return book;
	}
}
