package com.ddlab.rnd.many2manyU;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "m2mURepo")
public interface BookRepository extends JpaRepository<Book, Long> {

}
