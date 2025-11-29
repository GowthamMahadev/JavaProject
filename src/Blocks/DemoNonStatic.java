package Blocks;


	public class DemoNonStatic { 
		{ System.out.println("nsb1"); 
		} 
		
		{ System.out.println("nsb2");
		} 
		
		public static void main(String[] args) 
		{ 
			DemoNonStatic d = new DemoNonStatic(); 
			System.out.println("hi");
			DemoNonStatic d1 = new DemoNonStatic(); 
			System.out.println("Hello");
			DemoNonStatic d3 = new DemoNonStatic(); 
		} 
		
		{ 
			System.out.println("nsb3"); 
		}
	}

