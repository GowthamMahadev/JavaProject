package Sampleprog;

import java.util.Scanner;

public class Spy {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int product=1;
		int sum=0;
		int rem;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		if(sum==product)
		{
			System.out.println("Given number is spy");
		}
		else
		{
			System.out.println("Given number is not a spy");
		}
	}

}
