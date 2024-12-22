package com.libarymanagmentsystem.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.libarymanagmentsystem.daoimpl.BookDaoService;
import com.libarymanagmentsystem.pojo.Book;

@RestController
public class BookController {

	@Autowired
	public BookDaoService service;
	
	@GetMapping("/findAllBooks")
	public List<Book> getAllBooks(){
		return service.findAllBook();
	}
	
	@GetMapping("/findBook")
	public Book findBook(@RequestParam("id")String bid) {
		int id=Integer.parseInt(bid);
		return service.findBook(id);
	}
	
	@GetMapping("/findBookByTittle")
	public Book findBookByTittle(String tittle) {
		return service.findBookByTittle(tittle);
	}
	
	@PostMapping("/addBook")
	public HashMap<String,String> addBook(@RequestBody Book book,ModelMap map){
		HashMap<String,String>hmap=new HashMap<>();
		if(service.addNewBook(book))
			hmap.put("Message","Success");
		else
			hmap.put("Message","Failed");
		
		return hmap;
	}

   @PutMapping("/updateBook")
	public HashMap<String,String> updateBook(@RequestBody Book book,ModelMap map){
		HashMap<String,String>hmap=new HashMap<>();
		if(service.updateBook(book))
			hmap.put("Message","Success");
		else
			hmap.put("Message","Failed");
		
		return hmap;
	}

   @DeleteMapping("/deleteBook")
	public HashMap<String,String> deleteBook(@RequestParam("id")String bid,ModelMap map){
		HashMap<String,String>hmap=new HashMap<>();
		int id=Integer.parseInt(bid);
		if(service.deleteBook(id))
			hmap.put("Message","Success");
		else
			hmap.put("Message","Failed");
		
		return hmap;
	}

	
}
