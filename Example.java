import java.util.*;

public class Example {

	public static void main(String[] args)
	{
		 LinkedList l = new LinkedList();
		 l.add(10);
		 l.add(20);
		 l.add(30);
		 l.add(40);
		 l.add(50);
		 l.add(60);
		 l.add(70);
		 l.add(80);
		 
		 Iterator i = l.descendingIterator();
		// Integer in =null;
		while(i.hasNext())
		{
		// 	 in = (Integer)(i.next());
			System.out.println(i.next());
		}
		
		 
		 
		 

	}

}
