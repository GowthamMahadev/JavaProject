package Methods;

public class MethodRecurissionEven 
{
	public static void num(int i ,int b)
	 { 
	if(i%2==0) 
	{ 
		System.out.println(i);
	 } 
	i++; 
	if(i<=b) 
	{ 
		MethodRecurissionEven.num(i, b); 
	} } 
	public static void main(String[] args) 
	{ 
		MethodRecurissionEven.num(1, 10); 
	}
}
