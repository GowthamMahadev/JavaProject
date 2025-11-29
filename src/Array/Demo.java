package Array;

public class Demo 
{
	public static void main(String[] args) 
	{ 
		int [] a; //AD 
		
		a= new int [3];//AC 
		
		//int [] a = new int [3]; AD+AC
	 
		System.out.println(a[0]);
		System.out.println(a[1]); 
		System.out.println(a[2]); 
		System.out.println("______"); 
		a[0]=10; a[1]=20; a[2]=30; 
		System.out.println(a[0]); 
		System.out.println(a[1]); 
		System.out.println(a[2]); 
	}
}

