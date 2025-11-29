package toString;

public class Employee 
{
	int id; 
	String name; 
	@Override 
	public String toString() 
	{ 
		return "Employe [id=" + id + ", name=" + name + "]"; 
	} 
	
	Employee(int id,String name)
	{ 
		this.id=id; this.name=name; 
	} 
	
	public static void main(String[] args) 
	{ 
		Employee e1 = new Employee(1,"rahul"); 
		Employee e2 = new Employee(2,"raju"); 
		Employee e3 = new Employee(3,"ramu");
		Employee e4 = new Employee(4,"raji");
		Employee e5 = new Employee(5,"bheem"); 
		Employee [] a= {e1,e2,e3,e4,e5}; 
		for(int i=0;i<=a.length-1;i++) 
		{ 
			System.out.println(a[i]); 
		} 
		}
}
