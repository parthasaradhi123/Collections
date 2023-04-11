import java.util.*;

public class Example2 
{
	public static void main(String []args)
	{
	//ArrayList al = new ArrayList();
	
	List l = new ArrayList();
	
	//Collection c = new ArrayList();
	
	Queue q = new ArrayDeque(); //Queue is parent interface, This interface cannot access child methods, because they
	        // they are specialized methods.
	
	List la = new LinkedList();
	
	Deque ql = new LinkedList(); // Deque is child interface of Queue.
	ql.peekFirst();//specialized method present   
	
	Set s = new HashSet();
	
	
	
	}
	
}
