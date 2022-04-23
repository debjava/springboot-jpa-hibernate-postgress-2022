package com.ddlab.rnd.one2manyU;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "author_o2mU")
@Table(name = "author_o2m")
public class Author {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, 
orphanRemoval = true)
	@JoinColumn(name = "author_id")
	private List<Book> bookList = 
new ArrayList<Book>();
	
}
