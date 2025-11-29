package Methods;

import java.util.Scanner;

public class Shape 
{
	public static double areaofTriangle(int b,int h)
	{
		double half=0.5;
		double res=half*b*h;
		return res;
	}
	
	public static double areaofCircle(int r)
	{
		double pie=3.14;
		double res1=3.14*r*r;
		return res1;
	}
	
	public static int areaofSquare(int s)
	{
		int res2=s*s;
		return res2;
	}
	
	public static int areaofRectangle(int l,int b)
	{
		int res3=l*b;
		return res3;
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("how many times you want the loop?");
		int endnum=s.nextInt();
		
		for(int i=1;i<=endnum;i++)
		{
		System.out.println("Enter your choice");
		int choice=s.nextInt();
	
		switch(choice)
		{
		case 1:System.out.println("Enter the base");
			   int base=s.nextInt();
			   System.out.println("Enter the height");
			   int height=s.nextInt();
			   double res = Shape.areaofTriangle(base, height);
			   System.out.println(res);
			   break;
			   
		case 2:System.out.println("Enter the radius");
		   int radius=s.nextInt();
		   double res1 = Shape.areaofCircle(radius);
		   System.out.println(res1);
		   break;
		
		case 3:System.out.println("Enter the square");
		   int square=s.nextInt();
		   int res2 = Shape.areaofSquare(square);
		   System.out.println(res2);
		   break;
		   
		case 4:System.out.println("Enter the length");
		   int length=s.nextInt();
		   System.out.println("Enter the breath");
		   int breath=s.nextInt();
		   int res3= Shape.areaofRectangle(length, breath);
		   System.out.println(res3);
		   break;
		   
		default:System.out.println("InValidInput");
		       break;
		
		}

	}

}
}