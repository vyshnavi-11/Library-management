package com.srkr.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srkr.library.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
