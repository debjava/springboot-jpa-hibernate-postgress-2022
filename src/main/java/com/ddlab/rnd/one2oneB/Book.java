package com.ddlab.rnd.one2oneB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name="book_o2oB")
@Table(name="book_o2oB")
public class Book {

	@Id
	@Column(name = "BOOK_ID")
	@GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne
	@MapsId
	private Author author;
}
