package com.ddlab.rnd.many2manyB;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "author_m2mB")
@Table(name = "author_m2mB")
public class Author {

  @Id
  @GeneratedValue
  private long id;
	
  @Column(name = "name")
  private String name;

  @ManyToMany(cascade = CascadeType.ALL, 
      mappedBy = "authors")
  private List<Book> bookList = 
    new ArrayList<Book>();
	
}
