package Inheritance;

public class pratice1 extends Pratice
{
	int y=20;
	
	void sub() {
		System.out.println("Sub Method");
	}

	public static void main(String[] args)
	{
	 	pratice1 p=new pratice1();
	 	System.out.println(p.x);
	 	System.out.println(p.y);
	 	p.sub();
	 	p.add();
	}
}
