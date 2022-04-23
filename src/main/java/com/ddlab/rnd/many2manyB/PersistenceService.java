package com.ddlab.rnd.many2manyB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "auth_book_m2mService")
public class PersistenceService {
	@Autowired
	private AuthorRepository authRepo;

	@Autowired
	private BookRepository bookRepo;

	public void saveAuthorInfo(Author author) { authRepo.save(author); }
	public void saveBookInfo(Book book) { bookRepo.save(book); }
}
