package com.ddlab.rnd.one2manyU;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "book_o2mU")
@Table(name = "book_o2m")
public class Book {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	public Book() {
		
	}
	
	public Book(String name) {
		this.name = name;
	}
}
