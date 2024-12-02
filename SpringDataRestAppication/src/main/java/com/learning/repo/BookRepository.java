package com.learning.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learning.entity.Book;

@RepositoryRestResource(path = "books")
public interface BookRepository extends JpaRepository<Book, Integer> {

	public List<Book> findByBookNameContaining(@Param("bookName") String bookName);
}
