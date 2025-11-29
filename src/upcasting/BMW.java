package upcasting;

public class BMW extends Car{
	
	
	 void color()
	{
		System.out.println("The color of car is black");
	}
	
	 void price()
	{
		System.out.println("The price of the car is 1crore");
	}
	
	public static void main(String[] args) {
		
		Car c=new BMW();
		c.color();
		c.price();
	}

}
