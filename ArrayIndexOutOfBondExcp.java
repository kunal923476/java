package ExceptionHandling;

public class ArrayIndexOutOfBondExcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}
}
