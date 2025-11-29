package Sampleprog;

import java.util.Scanner;

public class Rahul {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int age=s.nextInt();
		
		if(age>=18) 
		{
			System.out.println("Raju is eligible to vote");
		}
		else
		{
			System.out.println("Raju is not eligible to vote");
		}	
				

	}

}
