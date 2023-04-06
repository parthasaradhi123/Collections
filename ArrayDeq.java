import java.util.ArrayDeque;

public class ArrayDeq {

	public static void main(String[] args) 
	{
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(7020);
		ad.add("Partha");
		ad.add("Saradhi");
		ad.add("Reddy");
		ad.add(143);
		System.out.println(ad);
		
		ad.addFirst(1);
		ad.addLast(2);
		
		System.out.println(ad.getFirst());
		
		System.out.println(ad.getLast());
		
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		
		System.out.println(ad);
		
	 
		
	}

}
