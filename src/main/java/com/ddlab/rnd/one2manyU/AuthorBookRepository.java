package com.ddlab.rnd.one2manyU;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "one2oneURepo")
public interface AuthorBookRepository extends JpaRepository<Author, Long> {

}
