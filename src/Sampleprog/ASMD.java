package Sampleprog;

public class ASMD {

	public static void main(String[] args) 
	{
		int choice=4;
		switch(choice)
		{
		case 1:int a=10;
		       int b=20;
		       System.out.println(a+b);
		       break;
		       
		case 2:int a1=31;
	       int b1=21;
	       System.out.println(a1-b1);
	       break;
	       
		case 3:int a2=55;
	       int b2=25;
	       System.out.println(a2*b2);
	       break;
	       
		case 4:int a3=22;
	       int b3=2;
	       System.out.println(a3/b3);
	       break;
		
	    default:System.out.println("invalid input");
	            break;
		}

	}

}
