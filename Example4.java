import java.util.*;

public class Example4 
{

	public static void main(String[] args) 
	{
		// 100 50 150 25 75 125 175.
		//Sort data we can use 
		// TreeSet -O(log2N) // skwed Tree-- O(N);
		//HashSet--0(1);
		
		
		
		TreeSet ts = new TreeSet();
		
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		Collections.sort(al);
		
		System.out.println(al);
		
		ArrayList<String> al2 = new ArrayList<String>();
	//	al2.add(28);
		al2.add("Partha");
		al2.add("Kadapa");
		al2.add("Reddy");
		//al2.add(51.6f);
	//	al2.add(12.5);
		//al2.add('c');
		
		//Collections.sort(al2); // This class is throwing an exception as wee know excecption is very bad.
		// So Inorder to avoid the exception we replace ArrayList withString generics.
		
		System.out.println(al2);
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		
		al3.add(1000);
		al3.add(200);
		Collections.sort(al3);
		System.out.println(al3);
		//al3.add(st); error
		
		
		//few more important inbuilt methods present in Collections Class.
		
		ArrayList al4 = new ArrayList();
		
		al4.add(10);
		al4.add(20);
		al4.add(30);
		al4.add(40);
		al4.add(50);
		al4.add(60);
		
		
	Collections.shuffle(al4);
	System.out.println(al4);
	System.out.println(Collections.min(al4));
	
		//int index = Collections.binarySearch(al4, 50);
		//System.out.println("Index "+index);
		
		
		
		
	}

}
