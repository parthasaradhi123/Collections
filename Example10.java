import java.util.*;

class Partha
{
	int i;
	public Partha(int i)
	{
		this.i =i;
	}
	public String toString()
	{
		return i+ "";
	}
}


public class Example10 {

	public static void main(String[] args)
	{
		Hashtable ht = new Hashtable();
		ht.put(11, "partha");
		ht.put(12, "Shiva");
		ht.put(22, "Krishna");
		ht.put(44, "Bhavana");
		
		System.out.println(ht);
		
		Hashtable ht2 = new Hashtable();
		
		ht2.put(new Partha(1), "reddy");
		ht2.put(new Partha(2), "saradhi");
		ht2.put(new Partha(22), "subbamaa");
		ht2.put(new Partha(33), "bhavana");
		
		System.out.println(ht2);
		
		
//		TreeMap tm = new TreeMap();
//		tm.put(11, "partha");
//		tm.put(12, "Shiva");
//		tm.put(46, "Krishna");
//		tm.put(44, "Bhavana");
//		
//		System.out.println(tm);
		
		

	}

}
