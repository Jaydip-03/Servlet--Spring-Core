package com.jsp.Books;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Database {
	String url ;
	String username ;
	String password ;
	
	
	public Database(
			@Value(value = "${db.url}") String url, 
			@Value(value = "${db.username}") String username,
			 @Value(value = "${db.password}") String password) {
		
				
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		
	}


	@Override
	public String toString() {
		return "Database [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	
	

}
