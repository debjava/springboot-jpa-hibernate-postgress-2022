package com.ddlab.rnd.one2oneU;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "book_o2oU")
@Table(name = "book_o2oU")
public class Book {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
}
