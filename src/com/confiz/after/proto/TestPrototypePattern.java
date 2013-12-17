package com.confiz.after.proto;



public class TestPrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		String moviePrototype = PrototypeFactory.getInstance(PrototypeFactory.MOVIE).toString();
		System.out.println(moviePrototype);

		String showPrototype = PrototypeFactory.getInstance(PrototypeFactory.SHOW).toString();
		System.out.println(showPrototype);
		
  }
}

