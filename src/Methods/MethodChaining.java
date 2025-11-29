package Methods;

public class MethodChaining {

	public static void add() 
	{ 
	System.out.println("add method"); 
	System.out.println(10+20); 
	MethodChaining.sub(); 
	} 
	public static void sub() 
	{
	 System.out.println("sub method"); 
	System.out.println(10-5); 
	MethodChaining.add(); 
	} 
	public static void main(String[] args) 
	{ 
		MethodChaining.add(); 
	}

}
