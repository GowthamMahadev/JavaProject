package String;

public class ReverseAsentence 
{


		public static void main(String[] args) {

			String s = "Ravi Is Handsome";
			String[] x = s.split(" ");

			String reverse = "";
			for (int i = x.length - 1; i >= 0; i--) {
				reverse = reverse + x[i] + " ";
			}

			System.out.println(s);
			System.out.println(reverse);
		}
	}
/*String s = "rahul"; 
		String rev = ""; 
		for(int i=s.length()-1;i>=0;i--) 
		{ 
			rev = rev + s.charAt(i);
		} 
		System.out.println(rev); 
		}*/
