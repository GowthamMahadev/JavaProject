package Constructor;

public class Mobile 
{
	String Model;
	String Color;
	Long price;
	
	Mobile(String m,String c,long p)
	{
		Model=m;
		Color=c;
		price=p;
	}

	void Display()
	{
		System.out.println(Model);
		System.out.println(Color);
		System.out.println(price);
		System.out.println("_________________________");
	}

	public static void main(String[] args) 
	{
		Mobile m=new Mobile("note4","white",12500);
		Mobile m1=new Mobile("iphone16","gold",125000);
		Mobile m2=new Mobile("IQ004","Black",50000);
		
		m.Display();
		m1.Display();
		m2.Display();
	}

}
