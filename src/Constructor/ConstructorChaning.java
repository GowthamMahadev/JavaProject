package Constructor;

public class ConstructorChaning 
{
	ConstructorChaning(int a,double b)
	{
		this();
		System.out.println("C-1");
	}

	ConstructorChaning()
	{
		
		System.out.println("C-2");
	}
	
	
	public static void main(String[] args) 
	{
		ConstructorChaning cl=new ConstructorChaning(10,20.22);
		
	}

}
