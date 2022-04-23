package com.ddlab.rnd.one2manyB;
import org.springframework.context.ApplicationContext;

public class TestOne2ManyBiDirectional {

	public static void saveInfo(ApplicationContext appContext) {
		PersistenceService pservice = appContext.getBean(PersistenceService.class);
		
		Author author = new Author();
		author.setName("Conan Doyle");
		author.getBookList().add(new Book("Cat Among Pigeons"));
		author.getBookList().add(new Book("Sherlock Homes"));
		
		pservice.saveInfo(author);
	}
}
