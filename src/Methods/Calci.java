package Methods;

public class Calci {
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}

	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public static void div(int a,int b)
	{
		System.out.println(a/b);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		Calci.add(10, 20);
		Calci.sub(50, 10);
		Calci.mul(10, 30);
		Calci.div(50, 2);
	}

}
