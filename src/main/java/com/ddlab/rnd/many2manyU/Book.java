package com.ddlab.rnd.many2manyU;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "book_m2mU")
@Table(name = "book_m2mU")
public class Book {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "author_m2mU_book_m2mU", 
		joinColumns = @JoinColumn(name = "book_id"),
		inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Set<Author> authors;
	
	public Book() {
		
	}
	
	public Book(String name) {
		this.name = name;
	}
}
