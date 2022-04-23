package com.ddlab.rnd.one2oneB;

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
@Entity(name = "author_o2oB")
@Table(name = "author_o2oB")
public class Author {

	@Id
	@Column(name = "AUTH_ID")
	@GeneratedValue
	private long id;

	@Column(name = "name")
	private String name;

	@OneToOne(fetch = FetchType.LAZY, 
cascade = { CascadeType.ALL })
	private Book book;

	public void setBook(Book book) {
		if (book == null) {
			if (this.book != null) {
				this.book.setAuthor(null);
			}
		} else {
			book.setAuthor(this);
		}
		this.book = book;
	}
}
