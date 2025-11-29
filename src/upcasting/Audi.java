package upcasting;

public class Audi extends Car
{
	
	 void color()
	{
		System.out.println("The color of car is Blue");
	}
	
	 void price()
	{
		System.out.println("The price of the car is 2Crore");
	}
	
	public static void main(String[] args) {
		
		Car c=new Audi();
		c.color();
		c.price();
	}
}
