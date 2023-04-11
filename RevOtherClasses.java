import java.util.*;

 
public class RevOtherClasses
{

	public static void main(String[] args) 
	{
		 ArrayList al = new ArrayList();
		 
		 al.add(123555726);
		 al.add('c');
		 al.add(30);
		 al.add(10.7f);
		 al.add(40.7);
		 al.add("Partha");
		 
		 for(Object obj:al)
		 {
			 System.out.print(obj+" , ");
		 }
		 
		 System.out.println();
		 System.out.println("========================");
		 
		 for(int i=0;i<al.size();i++)
		 {
			 System.out.println(al.get(i));
		 }
		 
		 System.out.println("========================");
	 
		 Iterator i = al.iterator();
	 	 
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		 
		 System.out.println("[============================]");
		 ListIterator lt = al.listIterator(al.size());
		 while(lt.hasPrevious())
		 {
			 System.out.println(lt.previous());
		 }
		 System.out.println("=================================");
		 
		 TreeSet ts = new TreeSet();
		 ts.add(123555726);
		 ts.add(10);
		 ts.add(30);
		 ts.add(10);
		 ts.add(40);
		 ts.add(60);
		 
		 System.out.println(ts);
		 System.out.println("===============================");
		 
		 
		 al.addAll(ts);
		 
		 System.out.println(al);
		 
		 ListIterator lt1 = al.listIterator(al.size());
		 
		 while(lt1.hasPrevious())
		 {
			 System.out.println(lt1.previous());
		 }
		 
		 
		 /*
		  * ArrayList, LinkedList,ArrayDeque,PriorityQueue,TreeSet,HashSet,LinkedHashSet
		  */
		 
		 System.out.println("/*-------------------------------------------------------------------------*/");
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(10);
		
		System.out.println("ArrayDeque ::-- "+ad);
		// 1.It allows duplicate values.
		//2.Index Based Accessing not allowed
		//3.Order Of Insertion is maintained
		
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(20);
		pq.add(1);
		
		System.out.println(pq);
		//1.IndexBased Accessing not allowed
		//2.It also allows duplicat value
		//3.order of insertion not maintained, but highest priority number will come first.
		
		TreeSet ts1 = new TreeSet();
		
		ts1.add(100);
		ts1.add(20);
		ts1.add(143);
		ts1.add(24);
		ts1.add(9);
		ts1.add(2);
		ts1.add(2);
		System.out.println("TressSet "+ts1);
		
		System.out.println(ts1.ceiling(9));
		System.out.println(ts1.ceiling(8));
		System.out.println(ts1.floor(20));
		System.out.println(ts1.floor(21));
		System.out.println(ts1.lower(9));
		System.out.println(ts1.higher(20));
		System.out.println("------------------------*********");
		 
		Iterator i2 = ts1.descendingIterator();
		
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		
		//1.Duplicate values are not at all allowed
		//2.Index Based accesing not allowed.
		//3.Order Insertion not Maintained but output will be in ascending order
		
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(20);
		hs.add(143);
		hs.add(24);
		hs.add(9);
		hs.add(2);
		hs.add(2);
		
		 
		//duplicates are not allowed
		//index based accessing not allowed
		//Order of insertion not maintained but in order to maintain that we have LinkedHashSet.
		
		System.out.println(hs);
		System.out.println(hs.contains(143));
		
		
		LinkedHashSet hls = new LinkedHashSet();
		hls.addAll(hs);
		System.out.println(hls);
		
		
		
		 
		 
		 
	}

}
