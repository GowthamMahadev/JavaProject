package Encapsulation;

public class Student 
{
	private int id=1; 
	public String getName() 
	{ 
		return name; 
	} 
	public void setName(String name) 
	{ 
		this.name = name; 
	} 
	
	private String name = "rahull"; 
	
	public int getId() 
	{ 
		return id; 
	} 
	
	public void setId(int id) 
	{ 
		this.id = id; 
	}
}
