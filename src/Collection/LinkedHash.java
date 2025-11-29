package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHash 
{
	public static void main(String[] args) 
	{ 
	LinkedHashMap < Integer ,String> h = new LinkedHashMap(); 
	h.put(1, "rahul"); 
	h.put(2, "raju"); 
	h.put(3, "ramu"); 
	System.out.println(h); 
	System.out.println(h.size());
	System.out.println(h.get(1)); 
	System.out.println(h.containsKey(3)); 
	System.out.println(h.containsValue("rahul")); 
	h.remove(2); 
	System.out.println(h); 
	System.out.println(h.isEmpty()); 
	h.clear(); 
	System.out.println(h.isEmpty()); 
	System.out.println(h);
	 } 
}
