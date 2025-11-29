package Sampleprog;

import java.util.Scanner;

public class MulwhileScanner {

	public static void main(String[] args) {

		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=1;
		
		while(i<=10) 
		{
			System.out.println(num*i);
			i++;
		}

	}

}
