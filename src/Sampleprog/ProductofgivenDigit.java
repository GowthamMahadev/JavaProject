package Sampleprog;

import java.util.Scanner;

public class ProductofgivenDigit {

	public static void main(String[] args) {
		
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int product=1;
		while(num>1)
		{
			int rem=num%10;
			product=rem*product;
			num=num/10;
		}
		System.out.println("The product of digits is "+product);
		}
}
