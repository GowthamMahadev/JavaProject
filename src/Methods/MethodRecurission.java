package Methods;

public class MethodRecurission 
{
	public static void num(int i ,int b) 
	{ 
		System.out.println(i); 
		i++; 
		if(i<=b) 
		{ 
			MethodRecurission.num(i, b); 
		} 
	}	
	
	public static void main(String[] args) 
	{
		MethodRecurission.num(1, 5);
	}
}
