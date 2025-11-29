package MethodOverding;

public class SBI extends Bank
{
	@Override
	void Location()
	{
			System.out.println("The loaction of bank is in mumbai");
	}
		
		void Interest()
		{
			System.out.println("The Current interest rate is 9.5");
		}

public static void main(String[] args)
{
	SBI b=new SBI();
	b.Location();
	b.Interest();
}


}
