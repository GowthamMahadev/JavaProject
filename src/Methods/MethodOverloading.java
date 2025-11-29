package Methods;

public class MethodOverloading 
{
	public static void login(String UN,String PW)
	{
		if(UN=="gowtham")
		{
			if(PW=="12345")
			{
				System.out.println("successful login");
			}
		
			else
			{
				System.out.println("Wrong Password");
			}
		}
	
		else
		{
			System.out.println("Invalid UserName");
		}
		
	}
	
	public static void login(long MN,String PW)
	{
		if(MN==1234567890)
		{
			if(PW=="12345")
			{
				System.out.println("successful login");
			}
		
			else
			{
				System.out.println("Wrong Password");
			}
		}
	
		else
		{
			System.out.println("Invalid MoileNumber");
		}
		
	}

	public static void main(String[] args) 
	{
		MethodOverloading.login("gowtham", "12345");
		MethodOverloading.login(1234567890, "12345");
	}}
	

