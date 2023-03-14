package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1=  new ArrayList<String>();
		
		list1.add("John");
		list1.add("Smith");
		list1.add("Sanjay");
		list1.add("Sanjeev");
		list1.add("Sanjay");
		//list1.add(null);
		
		System.out.println("The list is " + list1);
		
		System.out.println("The list size is " + list1.size());
		System.out.println("The second name is" + list1.get(1));
		System.out.println("The last element is " + list1.get(list1.size()-1));
		//list1.add(1,"Vijay"); // To add a new value to the list
		
		list1.set(1, "Vijay");
		System.out.println("The list after updating is " + list1);
		
		list1.remove(0); //to remove any value using index
		System.out.println("The list after removing is " + list1);
		
		System.out.println("Original ArrayList = "
                + list1);

// clone ArrayList
/*ArrayList list2  = (ArrayList)list1.clone();

// print ArrayList2
System.out.println("Clone ArrayList2 = "
                + list2);*/

//Iterator

for(int i=0;i<list1.size();i++)
	
{ System.out.println("Element name" +list1.get(i));
}

for (String value:list1)
{
	System.out.println(":Elementvalue " + value);
}

Iterator<String> itr = list1.iterator();
while (itr.hasNext())
{System.out.println(itr.next());
	}

Collections.sort(list1);
//System.out.println("Before sorting" + list2);
System.out.println("After sorting" + list1);


//reverse() will only reserve the existing list
//where as reverse order will sort and reserve the list
Collections.sort(list1,Collections.reverseOrder());

System.out.println("After reversing" + list1);

	}	

}
