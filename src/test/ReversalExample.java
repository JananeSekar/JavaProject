package test;

import java.util.Scanner;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str1 ;
String result ="";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your String: ");
		str1  =scanner.next();

		for(int i=(str1.length()-1);i>=0; i--)
		{
			result = result+str1.charAt(i);
			
		}
		//System.out.println(str1.charAt(i));
		System.out.println(result);
		
		//if (str1.equals(result))
		
		if (str1.equalsIgnoreCase(result))
		{
			System.out.println("PALINDROM");
	}
		else System.out.println("Not palindrom");
		
	String str ="David meets lilly and John";
	System.out.println(str);
		String[]  arr3 = str.split(" ");
		String result1="";
		for(int i=(arr3.length-1);i>=0; i--)
		{
			result1 = result1+arr3 [i]+" ";
			
		}
		
		System.out.println(result1.trim());
}
	
	
}
