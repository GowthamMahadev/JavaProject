package MethodOverding;

public class HDFC extends Bank
{
	@Override
	void Location()
	{
			System.out.println("The loaction of bank is in bangalore");
	}
		
		void Interest()
		{
			System.out.println("The Current interest rate is 6");
		}

public static void main(String[] args) {
	HDFC c=new HDFC();
	c.Location();
	c.Interest();
}

}
