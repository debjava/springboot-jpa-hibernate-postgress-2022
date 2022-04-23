package com.ddlab.rnd.one2manyU;

import org.springframework.context.ApplicationContext;

public class TestOne2ManyUniDirectional {

	public static void saveInfo(ApplicationContext appContext) {
		PersistenceService pservice = appContext.getBean(PersistenceService.class);
		
		Author author = new Author();
		author.setName("Conan Doyle");
		author.getBookList().add(new Book("Cat Among Pigeons"));
		author.getBookList().add(new Book("Sherlock Homes"));
		
		pservice.saveInfo(author);
	}
}
