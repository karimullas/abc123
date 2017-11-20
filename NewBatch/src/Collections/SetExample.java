package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public void method1()
	{
		LinkedHashSet<String> set= new LinkedHashSet<String>(4);
		set.add("Karimulla");
		set.add("Suresh");
		set.add("Karim");
		set.add("Suri");
		set.add("Karimulla");
		set.add("Suresh");
		set.add("Karim");
		set.add("Suri");
		set.add(null);
		set.add(null);
		set.add(null);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	public static void main(String args[])
	{
		SetExample obj= new SetExample();
		obj.method1();
	}

}
