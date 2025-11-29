package Interface;

public class Mushroom implements Veg{

	@Override
	public void add() 
	{

		System.out.println(10+20);
		
	}

	public static void main(String[] args) {
		Veg v=new Mushroom();
		v.add();
	}
}
