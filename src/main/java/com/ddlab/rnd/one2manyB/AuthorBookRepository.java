package com.ddlab.rnd.one2manyB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "one2ManyRepoB")
public interface AuthorBookRepository extends JpaRepository<Author, Long> {

}
