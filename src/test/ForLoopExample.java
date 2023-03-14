package test;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ascending order");
		for (int n = 1; n <= 10; n++) {
			System.out.println(n);
		}

		System.out.println("Descending order");
		for (int n = 10; n >0; n--) {
			System.out.println(n);
		}

		System.out.println("Lets print Even numbers");
		for (int n = 10; n >= 1; n = n - 2) {
			System.out.println(n); 

		}
		System.out.println("Printing tables");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = scanner.nextInt();
		//int num =2;
		for (int n=1; n<=10; n++)
			System.out.println(num* n ); 
		
		
		int [] arr1= {1,2,3,4,5,6};
		System.out.println("Printing Array");
		 for (int i=0;i<arr1.length;i++)
		 {
			 
			 System.out.println(arr1[i]);
			 
		 }
		 System.out.println("Printing for each");
 for (int val:arr1)
 { System.out.println(val);}
	}}



