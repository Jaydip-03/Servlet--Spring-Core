package com.jsp.Netflix;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Value(value = "${movie.title}")
	String title;
	@Value(value = "${movie.director}")
	String director;
	@Value(value = "${movie.rating}")
	double rating;
	
	public Movie() {
		System.out.println("movie is playiing");
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", rating=" + rating + "]";
	}
	
	
	
	

}
