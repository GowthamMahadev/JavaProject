package Constructor;

public class Car 
{
	String Model;
	String Color;
	String Engine;
	Long price;
	
	Car(String m,String c,String e,long p)
	{
		Model=m;
		Color=c;
		Engine=e;
		price=p;
	}
	void Display()
	{
		System.out.println(Model);
		System.out.println(Color);
		System.out.println(Engine);
		System.out.println(price);
		System.out.println("_____________________________");
	}
	
	public static void main(String[] args) 
	{
		Car c=new Car("Verna","black","petrol",12304);
		Car c1=new Car("Creta","white","diesel",14578);
		Car c2=new Car("swift","beige","electric",58795);
		
		c.Display();
		c1.Display();
		c2.Display();
	
	}
}
