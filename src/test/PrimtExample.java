package test;

public class PrimtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=23;
		boolean flag = true;
		
	for (int i=2;i<number/2;i++)
		
	{
		int result = number%i;
		
		if (result==0) {
			flag=false;
			break;
			
		}
		
	}
	if (flag== true)	
	{System.out.println("Non prime");	
	}
	else {
		System.out.println("Num is not a prime num");
	}

}}

