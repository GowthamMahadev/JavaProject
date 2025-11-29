package Methods;

import java.util.Scanner;

public class Assignment 
{
	public static void EvenNumber(int Startnum,int Endnum)
	{
		for(int i=Startnum;i<=Endnum;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);

			}
		}
	}

	public static void OddNumber(int Startnum,int Endnum)
	{
		
		while(Startnum<=Endnum)
		{
			if(Startnum%2==1)
			{
				System.out.println(Startnum);
			} 
			Startnum++;
		}

	}

	public static void Tales(int tableno,int Startnum,int Endnum)
	{
		int num=tableno;
		int i=Startnum;
		do {
			System.out.println(num*i);
			i++;
		}while(i<=Endnum);
	}


	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("how many times you want the loop?");
		int endnum=s.nextInt();

		for(int i=1;i<=endnum;i++)
		{
			System.out.println("Enter your choice");
			int choice=s.nextInt();

			switch(1) 
			{
			case 1:System.out.println("Enter the startnumber");
			int Startnum=s.nextInt();
			System.out.println("Enter the endnumer");
			int Endnumer=s.nextInt();
			Assignment.EvenNumber(Startnum, Endnumer);    
			break;

			case 2:System.out.println("Enter the startnumber");
			int Startnum1=s.nextInt();
			System.out.println("Enter the endnumer");
			int Endnumer1=s.nextInt();
			Assignment.OddNumber(Startnum1, Endnumer1);    
			break;

			case 3:System.out.println("Enter the tablenumer");
			int tablenum=s.nextInt();
			System.out.println("Enter the startnumer");
			int startnumer2=s.nextInt();
			System.out.println("Enter the startnumer");
			int endnumer2=s.nextInt();
			Assignment.Tales(tablenum, startnumer2, endnumer2);
			break; 






			}
		}


	}

}
