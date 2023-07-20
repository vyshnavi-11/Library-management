package com.srkr.library.entity;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



//import jakarta.persistence.OneToOne;

@Entity

public class Book {
	
	@Id
	@GeneratedValue
	private Long id;
	private String  bname;
	private String author;
	private String genre;
	private String description;


	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//	@Override
//	public String toString() {
//		return "Book [bookId=" + id + ", bname=" + bname + ", author=" + author + ", genre=" + genre
//				+ ", description=" + description + "]";
//	}
	
	

}

