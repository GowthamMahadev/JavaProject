package Constructor;

public class Laptop 
{
	/* Laptop1()//If we add return type it will become a method
	{
	System.out.println("Constructor executing");	
	}*/
	
	 Laptop()//constructor
	{
	System.out.println("Constructor executing");	
	}
	
	public static void main(String[] args) 
	{
		Laptop l=new Laptop();
		Laptop l1=new Laptop();
		System.out.println("end");
	}
}
