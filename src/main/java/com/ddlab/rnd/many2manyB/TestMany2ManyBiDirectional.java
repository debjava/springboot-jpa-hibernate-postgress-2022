package com.ddlab.rnd.many2manyB;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;

public class TestMany2ManyBiDirectional {

	public static void saveInfo(ApplicationContext appContext) {
		PersistenceService pservice = appContext.getBean(PersistenceService.class);
		
		Author author1 = new Author();
		author1.setName("Conan Doyle"); //Has written two books
		
		List<Author> classicAuthors = new ArrayList<>();
		classicAuthors.add(author1);
		
		
		Book book2 = new Book("Sherlock Homes");
		Book book3 = new Book("Cat Among The Pigeons");
				
		List<Book> classicBooks = new ArrayList<Book>();
		classicBooks.add(book2);
		classicBooks.add(book3);
		
		author1.setBookList(classicBooks);
		
		book2.setAuthors(classicAuthors);
		book3.setAuthors(classicAuthors);
		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~
				
		Book book1 = new Book("Live Happily"); // Written by two authors
		
		Author author3 = new Author();
		author3.setName("Chetan Bhagat");
		
		Author author4 = new Author();
		author4.setName("R. K. Narayan");
		
		List<Author> generalAuthors = new ArrayList<>();
		generalAuthors.add(author3);
		generalAuthors.add(author4);
		
		book1.setAuthors(generalAuthors);
		
		List<Book> generalBooks = new ArrayList<>();
		generalBooks.add(book1);
		author3.setBookList(generalBooks);
		author4.setBookList(generalBooks);
		
		pservice.saveAuthorInfo(author1); // Working
		
		// -- Get all the books id written by one author, just like ISBN no
		// SELECT id, book_id from author_m2mu a, author_m2mu_book_m2mu ab WHERE a.id = ab.author_id;
		
		pservice.saveBookInfo(book1);
		/*
		which book was written by many authors
		SELECT a.id, a.name, b.name FROM author_m2mu a, book_m2mu b WHERE b.id = 
		(SELECT ab.book_id FROM author_m2mu_book_m2mu ab 
			GROUP BY ab.book_id HAVING count(ab.book_id) >= 2);
		*/
	}
}
