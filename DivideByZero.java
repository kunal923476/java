package ExceptionHandling;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try
		{
			int a=2,b=0;
			int c=a/b;
			System.out.println("Division is :");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Continuing with prog");
	}

}
