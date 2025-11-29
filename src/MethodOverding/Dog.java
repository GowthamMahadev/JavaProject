package MethodOverding;

public class Dog extends Animal
{
	
	void ms()  
    {
		System.out.println("dog");
    }
	
	void walk()
	{
		System.out.println("dog ");
	}
	
	public static void main(String[] args) {
		Dog d=new Dog();
		d.ms();
		d.walk();
	
	}
}
