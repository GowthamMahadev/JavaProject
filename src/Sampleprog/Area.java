package Sampleprog;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter our choice");
		int choice=s.nextInt();
		
		switch(choice) {
		
		case 1:double half=0.5;
			  System.out.println("Enter the base");
			  int base=s.nextInt();
			  System.out.println("Enter the height");
			  int height=s.nextInt();
			  double res=half*base*height;
			  System.out.println("res");
			  break;
			  
			  
		case 2:System.out.println("Enter the square");
		       int square=s.nextInt();
		      System.out.println("Enter the square");
		      int square1=s.nextInt();
		      double res1=square*square1;
		      System.out.println(res1);
		      break;
			  
		case 3:double pie=3.14;
		  System.out.println("Enter the radius");
		  int radius=s.nextInt();
		  System.out.println("Enter the radius");
		  int radius1=s.nextInt();
		  double res2=pie*radius*radius1;
		  System.out.println(res2);
		  break;
		  
		case 4:System.out.println("Enter the length");
	       int length=s.nextInt();
	      System.out.println("Enter the breath");
	      int breath=s.nextInt();
	      double res3=length*breath;
	      System.out.println(res3);
	      break;
	      
		default:System.out.println("Invalid Input");
		  
		
		}

	}

}
