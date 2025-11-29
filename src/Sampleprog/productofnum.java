package Sampleprog;

public class productofnum {

	public static void main(String[] args) 
	{

		int pro = 1;
        for (int i = 1; i <= 5; i++) 
        {
            pro *= i;
            //sum=sum+i;
        }

        System.out.println("The sum of all numbers from 1 to 5 is: " + pro);

	}

}
