import java.util.*;

class Employee
{
	private int empid;
	private String name;
	private String empAdrr;
	
	@Override
	public String toString()
	{
		return "partha";
	}
	
	@Override
	public void finalize()
	{
		System.out.println(":: Garbage collector collected the object ::");
	}
	
}
public class Example8 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 Employee e = new Employee();
		 HashMap hm = new HashMap();
		
		 hm.put(e, "partha");
		 e=null;
		
		  
		 System.gc(); // call to Garbage collector.
		 Thread.sleep(2000);
		 System.out.println(hm);
		 

	}

}
