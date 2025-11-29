package toString;

public class Student
{
	int id;
	String name;
	long mobileno;
	
	Student(int id,String name,long mobileno)
	{ 
		this.id=id; 
		this.name=name; 
		this.mobileno=mobileno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileno=" + mobileno + "]";
	} 

	public static void main(String[] args) 
	{
		Student s1 = new Student(1,"rahul",123456); 
		Student s2 = new Student(2,"raheem",12345678); 
		Student s3 = new Student(3,"raghu",123456985);
		
		Student [] e= {s1,s2,s3};
		
		for(int i=0;i<=e.length-1;i++)
		{
			System.out.println(e[i]);
		}
	}











}
