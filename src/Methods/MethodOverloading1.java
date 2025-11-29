package Methods;

public class MethodOverloading1 {

	public static void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	
	public static void add(int a,int b,int c) 
	{
		System.out.println(a+b+c);
	}
	
	public static void add(int a,int b,int c,int d) 
	{
		System.out.println(a+b+c+d);
	}
	
	public static void main() 
	{ 
		System.out.println("a"); 
	} 
	
	public static void main(String[] a)
	{
		MethodOverloading1.add(10, 20);
		MethodOverloading1.add(12, 14, 10);
		MethodOverloading1.add(1, 2, 3, 4);
		MethodOverloading1.main();
	}

}
