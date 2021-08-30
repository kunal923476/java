package Pro1;

import java.util.Scanner;

public class RestoDemo extends Restaurant{

	void show()
	{
		System.out.println("The Restaurant is now OPEN..Welcome to Resto..");
	}
	
	void serv()
	{
		System.out.println("Restaurant is serving dishes like Italian, Chainiese etc. ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Restaurant r=new RestoDemo();
			Scanner sc=new Scanner(System.in);
			int opt;
			
			while(true)
			{
				System.out.println("\n1. IsOpen  2. Serves  3. Exit\nOpt: ");
				opt=sc.nextInt();
				
				if(opt>2)
					break;
				
				switch(opt)
				{
					case 1:r.show();
							break;
							
					case 2: r.serv();
							break;
							
					case 3: break;
				}
			}
	}

}
