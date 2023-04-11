import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example3 {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		
		
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
			//al.add(10);
		}
		//fail fast
		Iterator i = al.iterator();
		
		try 
		{
			while(i.hasNext())
			{
				System.out.print(i.next()+" ");
				al.add(10);
				 
			}
		}
		catch(ConcurrentModificationException ce)
		{
			System.out.println();
			System.out.println("::hey fool your progrmee failed first because of concurrent modification::");
		}
		
		/*
		 * Fail safe.
		 */
		CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
		cal.add(100);
		cal.add(200);
		cal.add(300);
		cal.add(400);
		cal.add(500);
		cal.add(600);
		
		Iterator i2 = cal.iterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
			cal.add(900);
		}
		
		
	}

}
