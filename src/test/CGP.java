package test;

import java.util.Scanner;

public class CGP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cgp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your CGP: ");
		cgp = scanner.nextInt();
		if (cgp > 85) {
			System.out.println("First class with Distinction");
		} else if (cgp < 85 & cgp >= 80)
			System.out.println("First class");
		else if (cgp < 79 & cgp >= 60)
			System.out.println("Second Class");
		else if (cgp < 59 & cgp >= 40)
			System.out.println("Third Class");
		else
			System.out.println("Can do better");
		scanner.close();
	}
}
