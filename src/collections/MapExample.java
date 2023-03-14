package collections;
import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,Integer> basket = new HashMap<String,Integer>();

basket.put("Item1", 1);
basket.put("Item2", 5);
basket.put("Item3", 4);
basket.put("Item4", 4);

System.out.println("The map is" + basket);
basket.put("Item2", 7);

System.out.println("After change" + basket);

basket.remove("Item2");
basket.put("Item5", null);	
System.out.println("After removing" + basket);

for (String item: basket.keySet()) {
	System.out.println("Item name is "+ item);
	System.out.println("Value is " + basket .get(item));
}


String str = "Clean World Green World Happy World";

String[] arr1 =str.split(" ");
HashMap<String,Integer> map1 = new HashMap<String,Integer>();

for (String word:arr1)
{
	if (!map1.keySet().contains(word)) {
		map1.put(word, 1);
	}else {
		map1.put(word, map1.get(word)+1);
	}
}
System.out.println(map1);
	}

}
