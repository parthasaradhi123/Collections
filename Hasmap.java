import java.security.KeyStore.Entry;
import java.util.*;
import java.util.Map;

 //import java.util.Entry;

class Student1
{
	private String name;
	private int marks;
	private int age;
	private String city;
	
	public Student1(String name,int marks,int age,String city)
	{
		this.name =name;
		this.marks = marks;
		this.age = age;
		this.city = city;
		
	}
	
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	
	
	@Override
	public String toString()
	{
		return name+" "+marks+" "+age+" "+city;
	}
	
}



public class Hasmap 
{

	public static void main(String[] args) 
	{
		Student1 s = new Student1("partha",25,25,"kadapa");
		Student1 s1 = new Student1("Saradhi",25,25,"vijyawada");
		Student1 s2 = new Student1("Reddy",25,25,"chennai");
		
		HashMap hm = new HashMap();
		hm.put(1, s);
		hm.put(2, s1);
		hm.put(3, s2);
		
		System.out.println(hm);
		System.out.println("===========================");
		Collection c = hm.values();	
		Iterator i = c.iterator();
		while(i.hasNext())
		{
		System.out.println("values :"+i.next());
			
		}
		
	 Set key = hm.keySet(); 
	 Iterator i2 = key.iterator();
	 while(i2.hasNext())
	 {
		 System.out.println("Key :"+i2.next());
		
    }
	 
	 
	 Set both = hm.entrySet();
	 
	 Iterator i3 = both.iterator();
	 while(i3.hasNext())
	 {
		 Map.Entry me = (Map.Entry)i3.next();
		 
		 System.out.println(me.getKey()+" :: "+me.getValue());
		 
	 }
		
		 
		
	}

}
