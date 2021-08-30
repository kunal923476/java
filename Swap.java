package Pro3;

import java.util.*;

public class Swap {
	
	int a,b;
	
	static void swap(int a,int b)
	{
		System.out.println("a = "+a+" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("\na = "+a+" b = "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value of A and B :");
		int a=s.nextInt();
		int b=s.nextInt();
		
		swap(a,b);
	}

}
