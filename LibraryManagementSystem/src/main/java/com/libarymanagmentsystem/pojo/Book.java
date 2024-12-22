package com.libarymanagmentsystem.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="book")
public class Book {

	/*
	 * Book :--class that represent books with oops concepts and follow
	 * pojo design pettern
	 */
	@Id
	@Column(name="id")
	@NotNull
	private int id;
	
	@Column(name="tittle")
	private String tittle;
	
	private String author;
	
	@Column(name="is_available")
    private boolean isAvailable;

	public Book() {
		super();
	}

	public Book(int id, String tittle, String author, boolean isAvailable) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.author = author;
		this.isAvailable = isAvailable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", tittle=" + tittle + ", author=" + author + ", isAvailable=" + isAvailable + "]";
	}
    
    
}
