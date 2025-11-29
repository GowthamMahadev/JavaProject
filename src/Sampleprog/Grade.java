package Sampleprog;

public class Grade {

	public static void main(String[] args) {
		int grade=85;
		
		if(grade>=90 && grade<=100)
		{
			System.out.println("Raju belongs to O Grade");
		}
		
		else if(grade>=70 && grade<=89)
		{
			System.out.println("Raju belongs to A Grade");
		}
		
		else if(grade>=50 && grade<=69)
		{
			System.out.println("Raju belongs to B Grade");
		}
		
		else if(grade>=35 && grade<=49)
		{
			System.out.println("Raju belongs to C Grade");
		}
		
		else if(grade>=0 && grade<=34)
		{
			System.out.println("Raju belongs to F Grade");
		}
		
		else
		{
			System.out.println("invalid input");
		}
		
	}

}
