import java.util.LinkedList;

public class LinkListinbm {

	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();   
		
		l.add(22);
		l.add(33);
		l.add(11);
		l.add(44);
		l.add("Partha");
		l.add("Partha");
		System.out.println(l.indexOf(11));
		l.add(2,"reddy");
		
		System.out.println(l);
		System.out.println(l.indexOf(11));
		l.add(30.7);
		
		LinkedList l2 = new LinkedList();
		l2.add(22);
		l2.add(33);
		l2.add(11);
		l2.add(44);
		l2.add("Partha");
		l2.add("Partha");
		
		System.out.println(l2);
		
		l2.add(l);
		System.out.println(l2.indexOf(l));
		
		 l.addFirst(143);
		 l.addLast(7020);
		 System.out.println(l);
		 
		 l.offer(43);
		 l.offerFirst(1245);
		 l.offerLast(98765);
		 System.out.println(l);
		 
	
		 System.out.println( l.peek());	 
		 System.out.println( l.peekFirst());
		 System.out.println(l.peekLast());
		 
		 	System.out.println(l.pollFirst());
		 	System.out.println(l.pollLast());
		 	
		 	System.out.println(l);
		 	
		 	System.out.println(l.contains(143));
		 	System.out.println(l.contains(421));
		 	
		 	System.out.println(l2.equals(l2));
		 	
		 	System.out.println(l.getFirst());
		 	System.out.println(l2.getLast());
		 	System.out.println(l.get(5));
		 	
		 	System.out.println(l);
		 	System.out.println(l2);
		 	
		 	System.out.println(l.isEmpty());
		 	System.out.println(l.subList(3, 6));
		 	 
		 	
		 
	}

}
