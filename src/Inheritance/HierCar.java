package Inheritance;

public class HierCar extends HierVehicle
{
	int price1=25400;
	int carno=5478;

	void engine() 
	{
		System.out.println("The diesel varient");
	}

	void store()
	{
		System.out.println("4 store Engine");
	}

	public static void main(String[] args) {

		HierCar hc=new HierCar();
		System.out.println(hc.Brand);
		System.out.println(hc.Color);
		System.out.println(hc.price1);
		System.out.println(hc.carno);
		hc.Brand();
		hc.Model();
		hc.engine();
		hc.store();

	}
}
