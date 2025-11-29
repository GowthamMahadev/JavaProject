package Inheritance;

public class HierMyntraMen extends HierarchicalMyntra 
{
	int ShirtSize=40;
	String Brand="Pieterson";
	
	void shirt() 
	{
		System.out.println("The Male Attire");
	}

   public static void main(String[] args) 
   {
	   HierMyntraMen men=new HierMyntraMen();
	   System.out.println(men.id);
	   System.out.println(men.pass);
	   System.out.println(men.ShirtSize);
	   System.out.println(men.Brand);
	   men.login();
	   men.shirt();
}
}
