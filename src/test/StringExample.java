package test;
import java.util.Scanner;
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1;
String name2;
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your String1: ");
name1  =scanner.next();
System.out.println("Enter your String2: ");
 name2=scanner.next();

String name3= name1+name2;

System.out.println("No. of char in first string is :" + name1.length());

System.out.println("Total length is : " + name3.length() );
System.out.println("the last char is : " + name3.charAt(name3.length()-1));
System.out.println(name3.toUpperCase());
System.out.println(name3.toLowerCase());
System.out.println(name3.toString());
	}

}
