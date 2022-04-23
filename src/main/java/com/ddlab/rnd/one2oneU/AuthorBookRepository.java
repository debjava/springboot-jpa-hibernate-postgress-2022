package com.ddlab.rnd.one2oneU;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "one2oneRepoU")
public interface AuthorBookRepository extends JpaRepository<Author, Long> {

}
