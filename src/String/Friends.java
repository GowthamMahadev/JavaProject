package String;

public class Friends 
{
	public static void main(String[] args) 
	{ 
		String a = "Rajeesh"; 
		System.out.println(a.substring(5)); 
		System.out.println(a.length());//imp 
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.startsWith("Raj")); 
		System.out.println(a.endsWith("esh")); 
		System.out.println(a.contains("jesh")); 
		System.out.println(a.concat(" is a good boy"));
		System.out.println(a.charAt(4));//imp 
		System.out.println(a.indexOf('e')); 
		System.out.println(a.lastIndexOf('e')); 
		}
}
