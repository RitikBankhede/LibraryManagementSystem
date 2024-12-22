package com.libarymanagmentsystem.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libarymanagmentsystem.dao.BookDao;
import com.libarymanagmentsystem.pojo.Book;
import com.libarymanagmentsystem.repository.BookRepository;

@Service
public class BookDaoService implements BookDao {

	@Autowired
	private BookRepository repo;
	
	@Override
	public List<Book> findAllBook() {
		List<Book> books=new ArrayList<>();
		try{
			repo.findAll().forEach(books::add);
			return books;
		}catch(Exception exc){
			exc.printStackTrace();
		    books.clear();
		    return books;
		}
	}

	@Override
	public Book findBook(int id) {
		try{
			Optional<Book>opt=repo.findById(id);
			if(opt.isPresent())
				return opt.get();
			else
				return null;
		}catch(Exception exc) {
			exc.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addNewBook(Book book) {
	  try{
		  Optional<Book>opt=repo.findById(book.getId());
		  if(opt.isPresent())
			  return false;
		  else {
		    repo.save(book);
		      return true;
		  }
	  }catch(Exception exc) {
		  exc.printStackTrace();
	      return false;
	  }	
	}

	@Override
	public boolean updateBook(Book book) {
	  try{
		  Optional<Book>opt=repo.findById(book.getId());
		  if(opt.isPresent()) {
			  repo.save(book);
			  return true; 
		  }else
              return true;			  
	  }catch(Exception exc) {
		  exc.printStackTrace();
		  return false;
	  }
	}

	@Override
	public boolean deleteBook(int id) {
		 try{
			  Optional<Book>opt=repo.findById(id);
			  if(opt.isPresent()) {
				  repo.delete(opt.get());;
				  return true; 
			  }else
	              return true;			  
		  }catch(Exception exc) {
			  exc.printStackTrace();
			  return false;
		  }
		}

	@Override
	public Book findBookByTittle(String tittle) {
	  try{
		  Book book=repo.findByTittle(tittle);
		  return book;
	  }catch(Exception exc) {
		  exc.printStackTrace();
		  return null;
	  }	
	}


}
