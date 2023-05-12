package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {

		Set<Integer> mySet = new HashSet<>(5);

		Random rnd = new Random();

		while (mySet.size() < 5) {
			mySet.add(rnd.nextInt(2, 12));
		}

		System.out.println(mySet);
	}
}
