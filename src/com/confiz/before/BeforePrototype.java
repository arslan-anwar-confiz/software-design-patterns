package com.confiz.before;

import com.confiz.after.proto.Movie;

public class BeforePrototype {
 
	public static void main(String[] args) {
		Movie thor = new Movie();
		thor.setName("Thor");
		
		Movie movie2 = new Movie(thor);
		
		
	}
}
