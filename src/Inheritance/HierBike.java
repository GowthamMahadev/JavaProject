package Inheritance;

public class HierBike extends HierVehicle 
{
	
	int Price=100000;
	int no=12453;
	
	void Register()
	{
		System.out.println("The vehicle is mysore REg");
	}
	
	void Engine() 
	{
		System.out.println("Petrol Engine");
	}
	
	public static void main(String[] args) {
		HierBike hb=new HierBike();
		hb.Brand();
		hb.Model();
		hb.Register();
		hb.Engine();
		System.out.println(hb.Brand);
		System.out.println(hb.Color);
		System.out.println(hb.Price);
		System.out.println(hb.no);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
