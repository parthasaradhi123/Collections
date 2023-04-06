//To use any of the collection classes we need to import from util package.

import java.util.*;



public class ExampleC {

	public static void main(String[] args) 
	{
		 
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		//homogenous data
		System.out.println(al);
		System.out.println("==============================");
		ArrayList al1 = new ArrayList();
		//heterogenous data
		
		al1.add("Partha");
		al1.add("kadapa");
		al1.add('r');
		al1.add(12.9);
		System.out.println(al1);
		System.out.println("=================================");
		
		ArrayList al2 = new ArrayList();
		
		al2.add(al1);
		System.out.println(al2);
		System.out.println("=====================================");

		ArrayList al3 = new ArrayList();
		al3.add(11);
		al3.add(22);
		al3.add(33);
		al3.add(44);
		
		System.out.println("Existing data :: "+al3);
		System.out.println();
		al3.add(2, 28);
		System.out.println("After Modiffication :: "+ al3);
		
		al3.add(0, 420);
		
		System.out.println("Adding element at front end:: "+al3);
		
       al3.add(143);
		
		System.out.println("Adding element at rear end:: "+al3);
	
		al3.addAll(0,al1);
		
		System.out.println(al3);
	}
	

}
