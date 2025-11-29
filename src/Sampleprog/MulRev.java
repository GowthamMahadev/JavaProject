package Sampleprog;

import java.util.Scanner;

public class MulRev {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=10;
		
		while(i>=1) 
		{
			System.out.println(num*i);
			i--;
		}

	}

}
