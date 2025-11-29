package Constructor;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		System.out.println("C-1");
	}

	ConstructorOverloading(int a)
	{
		System.out.println("C-2");
	}
	
	
	public static void main(String[] args) 
	{
		ConstructorOverloading cl=new ConstructorOverloading();
		ConstructorOverloading cl1=new ConstructorOverloading(10);
	}

}
