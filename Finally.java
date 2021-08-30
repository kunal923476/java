package ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=9,b=0;
			int c=a/b;
			System.out.println("Div "+c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Your next Step");
		}
	}

}
