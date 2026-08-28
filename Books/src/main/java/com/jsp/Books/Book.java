package com.jsp.Books;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
	@Value(value = "${book.name}")
	String name ;
	@Value(value = "${book.author}")
	String author ;
	
	
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}
	
	
	

}
