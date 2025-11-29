package Sampleprog;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value");
		int a = s.nextInt();
		
		switch(a)
		{
		case 1:System.out.println("BJP");
		break;
		
		case 2:System.out.println("AAP");
		break;
		
		case 3:System.out.println("Congress");
		break;
		
		default:System.out.println("invalid input");
		
		}
	}

}
