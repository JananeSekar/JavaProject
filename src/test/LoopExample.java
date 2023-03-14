package test;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		int num1 = 10;
		while (num <= 10) {
			System.out.print(num);
			num++;
		}
		System.out.println(" ");
		System.out.println("End of while loop");

		while (num >= 10) {
			System.out.println(num);
			num--;
		}
		System.out.println("End of while loop");

		while (num1 >= 0) {
			if (num1==5) 
			{
				num1--;
				System.out.println("We are skipping 5 here");
				continue;
			
				}
			System.out.println(num1);
			num1--;
		}
		System.out.println(" ");
		System.out.println("End of while loop");
		
		
	}

}
