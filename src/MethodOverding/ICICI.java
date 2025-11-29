package MethodOverding;

public class ICICI extends Bank
{
	@Override
	void Location()
	{
			System.out.println("The loaction of bank is in mysore");
	}
		
		void Interest()
		{
			System.out.println("The Current interest rate is 7.5");
		}
		
	public static void main(String[] args) {
		ICICI i=new ICICI();
		i.Location();
		i.Interest();
	}
}
