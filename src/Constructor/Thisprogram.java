package Constructor;

public class Thisprogram 
{
	String Name;
	String Color;
	String sex;
	String Bread;
	
	Thisprogram(String Name,String Color,String sex,String Bread)
	{
		this.Name=Name;
		this.Color=Color;
		this.sex=sex;
		this.Bread=Bread;
		
	}
	
	void display()
	{
		System.out.println(Name);
		System.out.println(Color);
		System.out.println(sex);
		System.out.println(Bread);
		System.out.println("____________________");
	}

	public static void main(String[] args) 
	{
		Thisprogram tp=new Thisprogram("monkey","black","Male","African");
		Thisprogram tp1=new Thisprogram("dog","white","Female","Indain");
		Thisprogram tp2=new Thisprogram("cat","golden","Female","Indain");
		tp.display();
		tp1.display();
		tp2.display();
	}
}
