package Inheritance;

public class son extends Father
{
	int b=15;
	
	void sub()
	{
		System.out.println(20-10);
	}
	
	public static void main(String[] args)
	{
		son s=new son();
		System.out.println(s.b);
		System.out.println(s.a);
	    s.add();
		s.sub();
		
	}
}
