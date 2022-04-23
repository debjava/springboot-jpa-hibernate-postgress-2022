package com.ddlab.rnd.many2manyU;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;

public class TestMany2ManyUniDirectional {

	public static void saveInfo(ApplicationContext appContext) {
		
		Book book = new Book("Live Happily");
		
		Author author3 = new Author("Chetan Bhagat");
		Author author4 = new Author("R. K. Narayan");
		
		Set<Author> generalAuthors = new HashSet<>();
		generalAuthors.add(author3);
		generalAuthors.add(author4);
		
		book.setAuthors(generalAuthors);
		
		
		PersistenceService pservice = appContext.getBean(PersistenceService.class);
		pservice.saveBookInfo(book);

		
	}
}
