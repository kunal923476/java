package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Anagram {
	
	String str;
	
	static void Check_anagram(char []s1,char []s2)
	{
		int n1=s1.length;
		int n2=s2.length;
		
		if(n1 != n2)
			System.out.println("Length of 2 Strings is not Same..");
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for(int i=0;i<n1;i++)
			if(s1[i] != s2[i])
				System.out.println("String is not Anagram");
		System.out.println("String is Anagram");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner s=new Scanner(System.in);
		char []str1=s.toCharArray
		char []str2=s.nextLine();*/
		
		char []s1= {'k','i','c','k'};
		char []s2= {'m','i','k','e'};
		anagram(s1,s2);
		
		char []s3= {'a','c','t'};
		char []s4= {'c','a','t'};
		anagram(s4,s3);
		
		char []s5= {'m','o','o','n'};
		char []s6= {'s','u','n'};
		Check_anagram(s5,s6);
		
	}

}
