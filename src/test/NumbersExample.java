package test;

public class NumbersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 =10;
int num2 =20;
int result1 = addition (num1,num2);
int result2 = subtraction(num1,num2);


System.out.println( "The sum is: " + result1);
System.out.println( "The difference is: " + result2);
//System.out.println(c);



	}
	
	public static int addition(int a,int b)
	{
return a+b;
}
	public static int subtraction (int a,int b)
	{
	return a-b;
}
	}