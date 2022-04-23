package com.ddlab.rnd.one2oneU;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "author_o2oU")
@Table(name = "author_o2oU")
public class Author {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;

	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
	private Book book;
	
}
