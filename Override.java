
public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		a.Name();
		
		Mango m=new Mango();
		m.Name();
	}

}

class Apple 
{
	void Name()
	{
		System.out.println("An Apple a day keeps a Doctor away");
	}
}

class Mango extends Apple
{
	void Name()
	{
		System.out.println("Mango is a King of Fruits");
	}
}
