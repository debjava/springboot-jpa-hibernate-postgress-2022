package com.ddlab.rnd.many2manyU;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "author_m2mU")
@Table(name = "author_m2mU")
public class Author {

  @Id
  @GeneratedValue
  private long id;

  @Column(name = "name")
  private String name;

  public Author() {

  }

  public Author(String name) {
	this.name = name;
  }
}
