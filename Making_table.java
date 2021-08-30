import java.util.*;

public class Table {

	int num;
	
	static void Table(int num)
	{
		/*for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
			while(i==10)
				break;
		}*/
		
		int i=1;
		while(i<=10)
		{
			System.out.println(num*i);
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Emter no:");
		int no=s.nextInt();
		Table(no);

	}

}
