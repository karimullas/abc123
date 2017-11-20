package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	
	public void methods()
	{	
		LinkedList<String> lt2 = new LinkedList<String>();
		lt2.add("Karimulla");
		lt2.add("India");
		lt2.add("Suresh");
		lt2.add("Karimulla");
		lt2.add("Suresh");
		lt2.add("USA");
		lt2.add("Rajendra");
		lt2.add("Suresh");
		lt2.add("Karimulla");
		lt2.add(null);
		lt2.add(null);
		lt2.add(null);
		/*for(int i=0;i<=lt2.size()-1;i++)
		{
			System.out.println(lt2.get(i));
		}*/
		
		/*ListIterator<String> li=lt2.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}*/
		
		Iterator<String> li=lt2.iterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}
	
	public static void main(String[] args)
	{
		ListExample obj= new ListExample();
		obj.methods();
	}
}
