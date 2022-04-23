package com.ddlab.rnd.one2manyB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "one2ManyServiceB")
public class PersistenceService {
	
	@Autowired
	private AuthorBookRepository repo;
	
	public void saveInfo(Author author) {
		repo.save(author);
	}

}
