package Inheritance;

public class HierMyntraWomen extends HierarchicalMyntra 
{
	String Sareecolor="Green";
	String Brand="MysoreSilk";
	
	void WomenAttire() 
	{
		System.out.println("The Women is wearing saree");
	}
	
	public static void main(String[] args) 
	{
		HierMyntraWomen women=new HierMyntraWomen();
		System.out.println(women.id);
		System.out.println(women.pass);
		System.out.println(women.Sareecolor);
		System.out.println(women.Brand);
		women.login();
		women.WomenAttire();
		
	}
}
