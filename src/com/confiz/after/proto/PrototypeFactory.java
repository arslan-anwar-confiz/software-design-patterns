package com.confiz.after.proto;

public class PrototypeFactory {
	public static final String MOVIE = "movie";
	public static final String SHOW = "show";
	private static java.util.Map<String , PrototypeCapable> prototypes = 
			new java.util.HashMap<String , PrototypeCapable>();

	
	 static{
	    prototypes.put(MOVIE, new Movie());
	    prototypes.put(SHOW, new Show());
	 }
	 
	 public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
		 return ((PrototypeCapable) prototypes.get(s)).clone();
	 }
}
