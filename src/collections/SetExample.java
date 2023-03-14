package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> set1 = new HashSet<String>();
 //It will accept null, not maintain order, remove duplicates
set1.add("Men");
set1.add("Pen");
set1.add("Zen");
set1.add("Den");
set1.add("Pen");
System.out.println("the Set is" + set1);

//sorted set
		TreeSet<String> set2 = new TreeSet<String>();
		
		set2.add("Zen");
		set2.add("Julli");
		set2.add("Kate");
		
		System.out.println("Sorted set" +set2);

	
		// convert set to list
		ArrayList<String> list1 = new ArrayList<String>(set1);
		System.out.println("Sorted list" +list1);


	}

}
