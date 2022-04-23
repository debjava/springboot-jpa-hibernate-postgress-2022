package com.ddlab.rnd.many2manyB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "Book_m2mBRepo")
public interface BookRepository extends JpaRepository<Book, Long> {

}
