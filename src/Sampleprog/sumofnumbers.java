package Sampleprog;

public class sumofnumbers {

	public static void main(String[] args) 
	{
		
		int sum = 0;
        for (int i = 1; i <= 5; i++) 
        {
            sum += i;
            //sum=sum+i;
        }

        System.out.println("The sum of all numbers from 1 to 5 is: " + sum);
	}

}
