package MethodOverding;

public class Cat  extends Animal
{
	void ms()  
    {
		System.out.println("cat makes sounds");
    }
	
	void walk()
	{
		System.out.println("cat will walk and sing ");
	}
	
	public static void main(String[] args) {
		Cat c=new Cat();
		c.ms();
		c.walk();
		

}
}