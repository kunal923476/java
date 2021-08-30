package ExceptionHandling;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String str;
		
		System.out.println("Length of String"+str.length());
		*/
		
		try
		{
			String str=null;
			System.out.println("Length of String"+str.length());
		}
		catch(RuntimeException e)
		{
			System.out.println(e);
		}
		System.out.println("String");
	}

}
