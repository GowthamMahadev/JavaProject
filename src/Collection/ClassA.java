package Collection;

import java.util.ArrayList;

public class ClassA {

	public static void main(String[] args) 
	{ ArrayList l = new ArrayList(); 
	l.add(10); l.add(null); 
	l.add("hi"); 
	l.add("bye");
	l.add(true); 
	System.out.println(l); 
	System.out.println(l.contains(10)); 
	l.remove(0); 
	System.out.println(l);
	System.out.println(l.size()); 
	System.out.println(l.isEmpty());
	l.clear(); 
	System.out.println(l.isEmpty());
	System.out.println(l); 
	} } 