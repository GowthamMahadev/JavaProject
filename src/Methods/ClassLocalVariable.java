package Methods;

public class ClassLocalVariable 
{
	static int x=10;
	static int y=20;
	static int i=30;
	static int j=40;
	
	public static void add()
	{
		System.out.println(10+20);
	}
	
	public static void sub()
	{
		System.out.println(30-20);
	}
	
	public static void mul()
	{
		System.out.println(30*20);
	}
	
	public static void div()
	{
		System.out.println(30/10);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Methos");
		System.out.println(ClassLocalVariable.x);
		System.out.println(ClassLocalVariable.y);
		System.out.println(ClassLocalVariable.i);
		System.out.println(ClassLocalVariable.j);
		ClassLocalVariable.add();
		ClassLocalVariable.sub();
		ClassLocalVariable.mul();
		ClassLocalVariable.div();

	}

}
