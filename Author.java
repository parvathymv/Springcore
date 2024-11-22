package com.autowire;

import testproj.beans.Book;
public class Author {
	private String name;
	private Book bk;

	public Author() {
	}

	public Author(String name, Book bk) {

		this.name = name;
		this.bk = bk;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBk() {
		return bk;
	}

	public void setBk(Book bk) {
		this.bk = bk;
	}

}
