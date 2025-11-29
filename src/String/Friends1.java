package String;

public class Friends1
{
	public static void main(String[] args) 
	{ 
		String s = "rahul"; 
		System.out.println(s); 
		for(int i=0 ;i<=s.length()-1;i++) 
		{ System.out.println(s.charAt(i)); 
		} 
		System.out.println("______-");
		for(int i=s.length()-1 ;i>=0;i--) 
		{ 
			System.out.println(s.charAt(i)); 
		}
	}
}
