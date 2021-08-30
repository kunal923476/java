
public class Car extends Vehical{
	
	void disp()
	{
		System.out.println("Car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class Maruti extends Car
{

	void disp()
	{
		System.out.println("Maruti 800");
	}
}

class Kia extends Car
{
	void disp()
	{
		System.out.println("Kia Sonet");
	}
}