package Blocks;

public class StaticBlock 
{
	static int x; 
	static int y; 

	static 
	{ 
		System.out.println("sb1");
		x=20; 
		y=60;
	} 
	static 
	{ 
		System.out.println("sb2"); 
		y=40;

	} 
	public static void main(String[] args) 
	{ System.out.println("start"); 
	System.out.println(StaticBlock.x); 
	System.out.println(StaticBlock.y); 
	System.out.println("end");
	} 
	
	static 
	{ 
		System.out.println("sb3"); 
		x=80;
	}
	static { System.out.println("sb4"); 
	y=70;
	}

}
