package com.libarymanagmentsystem.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.libarymanagmentsystem.pojo.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

	Book findByTittle(String tittle);
}
