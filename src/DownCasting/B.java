package DownCasting;

public class B extends  A
{
	int y=20;
	
	public static void main(String[] args) 
	{
		A a=new B();
		//System.out.println(a.x);
		//System.out.println(a.y);//CTE //Upcasting
		
		B b=(B)a;
		System.out.println(b.x);
		System.out.println(b.y);//DownCasting
	}
}
