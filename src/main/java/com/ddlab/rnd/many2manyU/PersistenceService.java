package com.ddlab.rnd.many2manyU;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "m2mUService")
public class PersistenceService {

	@Autowired
	private BookRepository bookRepo;

	public void saveBookInfo(Book book) {
		bookRepo.save(book);
	}
}
