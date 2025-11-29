package Array;

import java.util.Scanner;

public class Friends 
{
	 
		public static void main(String[] args) 
		{ 
			Scanner s = new Scanner(System.in);
			String [] a = new String[4]; 
			
			for(int i=0;i<=a.length-1;i++) 
			{ 
				System.out.println("enter the name"); 
				a[i]= s.next(); 
			} 
			
			for(int i=0;i<=a.length-1;i++) 
			{ 
				System.out.println(a[i]); 
			} 
			
			System.out.println("_____________"); 
			for(int i=a.length-1;i>=0;i--) 
			{ 
				System.out.println(a[i]); 
			} 
			
		}
	}

