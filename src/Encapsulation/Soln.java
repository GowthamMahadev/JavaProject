package Encapsulation;

public class  Soln extends Student 
{ 
	public static void main(String[] args) 
	{ 
		Soln s =new Soln(); 
		//System.out.println(s.id); 
		System.out.println(s.getId()); 
		s.setId(2); 
		System.out.println(s.getId()); 
		System.out.println(s.getName()); 
		s.setName("rahul"); 
		System.out.println(s.getName()); }
}

