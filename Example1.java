import java.util.Enumeration;
import java.util.Vector;

public class Example1 {

	public static void main(String[] args)
	{
		Vector v = new Vector();
		 v.add(10);
		 v.add(20);
		 v.add(30);
		 v.add(40);
		 v.add(50);
		 v.add(60);
		 v.add(70);
		 v.add(80);
		 
		 Enumeration e = v.elements();
		 
		 while(e.hasMoreElements())
		 {
			 System.out.print(e.nextElement()+" ");
		 }
		 
		
	}

}
