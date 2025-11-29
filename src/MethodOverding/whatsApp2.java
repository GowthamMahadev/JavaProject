package MethodOverding;

public class whatsApp2 extends whatsApp1
{
	void call()
	{
		System.out.println("Audio Feature");
		System.out.println("Video Feature");
	}
	
	void message()
	{
		System.out.println("Text Feature");
		System.out.println("Video/Picture Feature");
	}
	
	public static void main(String[] args)
	{
		whatsApp2 wh=new whatsApp2();
		wh.call();
		wh.message();
	}
}
