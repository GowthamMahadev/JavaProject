package Sampleprog;

import java.util.Scanner;					

public class scanner1 {
	
	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice = s.nextInt();
		
		switch(choice)
		{
		case 1:System.out.println("Enter the value");
		        int a=s.nextInt();
		       System.out.println("Enter the value");
		        int b=s.nextInt();
		       System.out.println(a+b);
		       
		break;
		
		case 2:System.out.println("Enter the value");
                int a1=s.nextInt();
               System.out.println("Enter the value");
                int b1=s.nextInt();
               System.out.println(a1-b1);
		       break;
		
		case 3:System.out.println("Enter the value");
                int a2=s.nextInt();
               System.out.println("Enter the value");
                int b2=s.nextInt();
               System.out.println(a2*b2);
                break;
		
		default:System.out.println("invalid input");
	
	}
	}
}
