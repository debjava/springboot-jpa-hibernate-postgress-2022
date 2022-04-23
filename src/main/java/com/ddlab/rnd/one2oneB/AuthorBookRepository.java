package com.ddlab.rnd.one2oneB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "one2oneBRepo")
public interface AuthorBookRepository extends JpaRepository<Author, Long> {

}
