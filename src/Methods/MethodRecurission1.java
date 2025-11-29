package Methods;

public class MethodRecurission1 {

	public static void num(int i ,int b) 
	{ 
	 System.out.println(i); 
	 i--; 
	if(i>=b) 
	{ 
		MethodRecurission1.num(i, b); 
	} 
	} 
	public static void main(String[] args) 
	{ 
		MethodRecurission1.num(5, 1);
	}
}


