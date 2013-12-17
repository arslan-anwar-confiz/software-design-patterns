package com.confiz.prototype;

public class Amoeba implements Unicellular {

	public Unicellular reproduce() {
		Unicellular amoeba = null;
		try {
			amoeba = (Unicellular) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return amoeba;
	}

	public String toString() {
		return "String new amoeba...";
	}

}
