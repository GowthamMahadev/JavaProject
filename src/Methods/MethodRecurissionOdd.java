package Methods;

public class MethodRecurissionOdd 
{
	public static void num(int i ,int b)
	 { 
	if(i%2==1) 
	{ 
		System.out.println(i);
	 } 
	i++; 
	if(i<=b) 
	{ 
		MethodRecurissionOdd.num(i, b); 
	} } 
	public static void main(String[] args) 
	{ 
		MethodRecurissionOdd.num(1, 10); 
	}
}
