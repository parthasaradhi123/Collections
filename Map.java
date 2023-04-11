 import java.util.*;


public class  Map
{
	 

	public static void main(String[] args)
	{
		//Maints Order of Insertion 
	//	LinkedHashMap hm = new LinkedHashMap();
		HashMap hm = new HashMap();
		
	//	Map hm1 = new HashMap();
		
		hm.put(11, "Partha");
		hm.put(07, "MSD");
		hm.put(18, "Kohli");
		
		System.out.println(hm.get(18));
		
		Collection c = hm.values();
		
		Iterator i = c.iterator();
		
		while(i.hasNext())
		{
			String o = (String)(i.next());
			System.out.println(" Values : "+o);
		}
		
		Set s = hm.keySet(); // return type is set.
		Iterator i2 = s.iterator();
		
		while(i2.hasNext())
		{
			Integer k = (Integer)(i2.next());
			System.out.println("Key :"+k);
		}
		
		System.out.println("===========================");
		
		Set es = hm.entrySet();	
		
		Iterator i3 = es.iterator();
		
//		while(i3.hasNext())
//		{
//			Map.Entry da = (Entry)i3.next();
//			System.out.println(da.getkey()+" : "+da.getvalue());
//		}
//		
		
		System.out.println(hm);
		
		
		
		
		
		
	}
}
