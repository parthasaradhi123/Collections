import java.util.*;

class Employee1
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
public class WeakMap {

	public static void main(String[] args)throws Exception
	{
		Employee1 e = new Employee1();
		
		WeakHashMap wm = new WeakHashMap();
		
		wm.put(e,"Partha");
		
		e=null;
		System.gc();// here garbage collector will dominate weakhashmap.
		
		Thread.sleep(3000);
		System.out.println(wm);
		
	}

}
