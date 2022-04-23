package com.ddlab.rnd.many2manyB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "Auth_m2mBRepo")
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
