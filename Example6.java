import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Example6 {

	public static void main(String[] args) 
	{
		//When ever we wanna search something then we should go for TreeSet Class or collection.
		
		TreeSet ts = new TreeSet();
		ts.add(143);
		ts.add(567);
		ts.add(1);
		ts.add(67);
		ts.add(14);
		ts.add(7);
		ts.add(13);
		ts.add(57);
		
		System.out.println(ts);
		
		Iterator i = ts.descendingIterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		
		// Not only by using Treeset we can sort data but also by using List we can sort data
		// But in order to sort the data with List we need some assistance that assistance will be given by the 
		// Concurrent Pacakage. it is a subpackage present in util package.
		
		ArrayList al = new ArrayList();
		al.add(143);
		al.add(567);
		al.add(1);
		al.add(67);
		al.add(14);
		al.add(7);
		al.add(13);
		al.add(57);
		System.out.println(al);
		
		/*
		 * In order to sort our data that is present in List we use sortmethod present in Collections class
		 */
		Collections.sort(al);
		System.out.println("Sorted arraylist using collections class sort method ::--"+al);
		
		
		/*
		 * fail fast we handle it using iterator
		 */
//		Iterator i3 = al.iterator();
//		while(i3.hasNext())
//		{
//			System.out.println(i3.next());
//			al.add(20);
//		}
		
		//When ever you Hear the Concurrent the word comes to your mind is Fail safe
		/*
		 * fail safe we handle it using the concurrent class so that there will be no addition of data and
		 *  and no abropt termination of our application.
		 */
		CopyOnWriteArrayList cal =new CopyOnWriteArrayList();
		cal.add(143);
		cal.add(567);
		cal.add(1);
		cal.add(67);
		cal.add(14);
		cal.add(7);
		cal.add(13);
		cal.add(57);
		
		Iterator i2 = cal.iterator();
		
		while(i2.hasNext())
		{
			System.out.print(i2.next()+" ");
			cal.add(20);
		}
		
//		for(int j=0;j<cal.size();j++)
//		{
//			System.out.println(j.next);
//		}
		
		
	}

}
