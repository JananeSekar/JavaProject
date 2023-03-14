package test;

public class ArrayExample {

	public static void main(String[] args) {
	
		 // TODO Auto-generated method stub
		int[] arr1 = {10,20,30,40,50,55,60};
		System.out.println("Lenght of the array1 is :" + arr1.length);
		System.out.println("Second element in array 1: " + arr1 [1]);
		System.out.println("Last element is :" + arr1[arr1.length-1]);
		
		
		String[] arr2= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		System.out.println("Lenght of the array2 is :" + arr2.length);

		System.out.println("Last element in array2 :" + arr2[arr2.length-1]);
		
		String str ="Clean World Green World";
		String[]  arr3 = str.split(" ");
		System.out.println("Total number of words :" + arr3.length);
	
		System.out.println("Last element in array3 :" + arr3[arr3.length-1]);
		}
	}


