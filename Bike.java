
public class Bike extends Vehical{
	
	void disp()
	{
		System.out.println("Bike");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Activa extends Bike
{
	void disp()
	{
		System.out.println("Activa 5G");
	}
}

class Access extends Bike
{
	void disp()
	{
		System.out.println("Access 125");
	}
}