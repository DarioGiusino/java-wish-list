package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> wishList = new ArrayList<>();

		while (true) {
			System.out.print("Vuoi inserire un nuovo desiderio: ");
			Boolean bool = sc.nextBoolean();

			if (bool) {
				System.out.println("Scrivi il desiderio...");
				String wish = sc.next();
				wishList.add(wish);
				System.out.println("La lista dei tuoi desideri contiene " + wishList.size()
						+ " elemento/i. Vuoi continuare ad inserirne altri?");
			} else {
				System.out.println("Grazie, ecco la lista dei tuoi desideri: ");
				
				for(String s : wishList) {
					System.out.println(s);
				}
				
				return;
			}
		}
	}
}
