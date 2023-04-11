import java.util.HashSet;
import java.util.LinkedHashSet;

public class Hasset {

	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		
		hs.add(100);
		hs.add(10);
		hs.add(20);
		hs.add(50);
		hs.add(143);
		hs.add(546);
		hs.add(789);
		
		System.out.println(hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(100);
		lhs.add(10);
		lhs.add(20);
		lhs.add(50);
		lhs.add(143);
		lhs.add(546);
		lhs.add(789);
		lhs.add(10);
		
		System.out.println(lhs);
		
		
	}

}
