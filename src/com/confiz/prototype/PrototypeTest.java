package com.confiz.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
	public static void main(String[] args) {

		Unicellular amoeba = new Amoeba();

		List<Unicellular> amoebaList = new ArrayList<Unicellular>();

		amoebaList.add(amoeba.reproduce());
		amoebaList.add(amoeba.reproduce());
		amoebaList.add(amoeba.reproduce());

		for (Unicellular a : amoebaList)
			System.out.println(a);

	}
}
