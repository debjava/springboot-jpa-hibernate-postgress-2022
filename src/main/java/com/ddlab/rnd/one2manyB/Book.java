package com.ddlab.rnd.one2manyB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "book_o2mB")
@Table(name = "book_o2mB")
public class Book {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Author author;
	
	public Book() {
		
	}
	
	public Book(String name) {
		this.name = name;
	}
}
