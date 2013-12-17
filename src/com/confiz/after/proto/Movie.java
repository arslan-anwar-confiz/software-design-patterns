package com.confiz.after.proto;

public class Movie implements PrototypeCapable {
	
	private String name = null;

	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(Movie movie) {
		this .setName(movie.getName());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie object..");
		return (Movie) super.clone();
	}


	public String toString() {
		return "Movie";
	}

}
