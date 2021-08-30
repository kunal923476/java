package Pro3;

import java.util.Scanner;

public class Even {

	int a;
	
	static void even(int a)
	{
		if(a%2==0)
			System.out.println("Entered Number is Even..");
		else
			System.out.println("Entered Number is Odd..");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value of A :");
		int a=s.nextInt();
		
		even(a);
	}

}
