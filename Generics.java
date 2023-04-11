import java.util.*;

   
public class Generics 
{

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		//Type of data that we are gonna save inside the Arraylist is fixed i.e., String.
		al.add("partha");
		al.add("Reddy");
		al.add("Shiva");
		
		String s = al.get(0);
		String s1 = al.get(1);
		
		System.out.println(s);
		System.out.println(s1);
		
		List<String> l4 = new ArrayList<String>();
		
		Collection<String> l5 = new ArrayList<String>();
		
		
		
		

	}

}
