package Sampleprog;

import java.util.Scanner;

public class sevennumRev {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		for(int i=10;i>=1;i--) 
		{ 
			System.out.println(num*i); 
			}
		

	}

}
