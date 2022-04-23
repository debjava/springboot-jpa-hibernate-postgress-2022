package com.ddlab.rnd.one2oneU;

import org.springframework.context.ApplicationContext;

public class TestOne2OneUniDirectional {

	public static void saveInfo(ApplicationContext appContext) {
		PersistenceService pservice = appContext.getBean(PersistenceService.class);
		
		Author author = new Author();
		author.setName("Conan Doyle");
		Book book = new Book();
		book.setName("Cat Among Pigeons");
		author.setBook(book);
		
		pservice.saveInfo(author);
		
		System.out.println("Information Saved ...");
	}
}
