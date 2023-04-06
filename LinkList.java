import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args)
	{
		 LinkedList l = new LinkedList();
		 
		 l.add(10);
		 l.add(10);
		 l.add("partha");
		 l.add("partha");
		 l.add(143);
		 System.out.println(l);
		 
		 System.out.println("=======================");
		 
		  l.addFirst("shivayaa");
		  l.add(3 ,"kadapa");
		  l.addLast("shivabhavagan");
		  
		  System.out.println(l);
		  

	}

}
