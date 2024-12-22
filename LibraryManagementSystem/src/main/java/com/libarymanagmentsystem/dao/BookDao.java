package com.libarymanagmentsystem.dao;

import java.util.List;

import com.libarymanagmentsystem.pojo.Book;

public interface BookDao {

	List<Book> findAllBook();
	Book findBook(int id);
	Book findBookByTittle(String tittle);
	
	boolean addNewBook(Book book);
	boolean updateBook(Book book);
	boolean deleteBook(int id);
}
