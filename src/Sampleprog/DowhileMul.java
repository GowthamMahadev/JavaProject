package Sampleprog;

import java.util.Scanner;

public class DowhileMul {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=s.nextInt();
		int i=1;
		do {
			System.out.println(num*i);
			i++;
		   }while(i<=10);
	}

}
