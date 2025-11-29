package Encapsulation;

public class EmopSolu extends Employe
{
	public static void main(String[] args) {
		
		EmopSolu s=new EmopSolu();
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getSalary());
		s.setId(2);
		System.out.println(s.getId());
		s.setName("Gowtham");
		System.out.println(s.getName());
		s.setSalary(12000);
		System.out.println(s.getSalary());
	}
}
