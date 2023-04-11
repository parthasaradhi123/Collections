import java.util.*;
import java.util.Map;
 
class Information
{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	
	public Information(String name,int age,String fatherName, String city)
	{
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.city = city;
		
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString()
	{
		return name+" "+age+" "+fatherName+" "+city;
	}
	
}

public class PassPort {

	public static void main(String[] args) 
	{
		 Information i = new Information("ParthaSaradhiReddy",25,"V.SubbaReddy","kadapa");
		 Information i2 = new Information("Bhavana",23,"V.SubbaReddy","chennur");
		 Information i3 = new Information("subbama",45,"kanchi","kotal");
		 
		 HashMap hs = new HashMap();
		 
		 hs.put(123, i);
		 hs.put(111, i2);
		 hs.put(222, i3);

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Welcome to passport detais Applicatipn :");
		 System.out.println();
		 System.out.println("Please enter the passport number");
		 Integer in2 = sc.nextInt();
		 
		 boolean flag = true;
		 
		 Set s4 = hs.entrySet();
		 Iterator i4 = s4.iterator();
		 
		 while(i4.hasNext())
		 {
			 Map.Entry mp =(Map.Entry)i4.next();
			 Integer key = (Integer)mp.getKey();
			 
			 if(in2==key)
			 {
				 System.out.println("PassPort Number : "+ mp.getKey()+":"+mp.getValue() );
				// break;
				// System.exit(0);
				 flag =false;
			 }
			 
		 }
		 
		 if(flag)
		 {
			 System.out.println(":: Passport number not found ::");
		 }
	}

}
