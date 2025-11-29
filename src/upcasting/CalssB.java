package upcasting;

public class CalssB extends ClassA
{ 
	int y= 20;
	public static void main(String[] args) 
	{ 
		//upcasting 
		ClassA a = new CalssB(); 
		System.out.println(a.x);//10 
		//System.out.println(a.y);cte 
		System.out.println("__________-"); 
		//downcasting 
		CalssB b = (CalssB)a; 
		System.out.println(b.x);
		System.out.println(b.y); 
	}
}


