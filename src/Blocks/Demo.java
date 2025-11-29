package Blocks;

public class Demo 
{
	{
		System.out.println("nsb1");
	}
	
	static
	{
		Demo d1=new Demo();
		System.out.println("sb1");
	}
	
	static
	{
		System.out.println("sb2");
		Demo d1=new Demo();
		
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		Demo d=new Demo();
		Demo d1=new Demo();
	}
	
	
	{
		System.out.println("nsb2");
		
		
	}
	static
	{
		Demo d1=new Demo();
		System.out.println("sb3");
		
		
	}
	
}
