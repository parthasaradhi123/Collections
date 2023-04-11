import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(420);
		pq.add(25);
		pq.add(54);
		pq.add(125);
		pq.add(175);
		pq.add(1);
		pq.add(143);
		pq.add(567);
		pq.add(0);
		//pq.add("partha");
		//pq.add(12.8);
		
		System.out.println(pq);
		pq.add(0);
		System.out.println(pq);
		
	}

}
