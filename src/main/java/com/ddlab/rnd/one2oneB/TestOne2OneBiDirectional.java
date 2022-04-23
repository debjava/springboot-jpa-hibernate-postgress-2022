package com.ddlab.rnd.one2oneB;

import org.springframework.context.ApplicationContext;

public class TestOne2OneBiDirectional {
	
	public static void saveInfo(ApplicationContext applicationContext) {
		Author author = new Author();
		author.setName("Larry Colins");
		Book book = new Book();
		book.setName("Indian Freedom Movement");
		author.setBook(book);
		
		PersistenceService service = applicationContext.getBean(PersistenceService.class);
		service.saveInfo(author);
	}
}
