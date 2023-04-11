import java.util.*;

class Student
{
	private int age;
	private int marks;
	private String name;
	
	
	public Student(int age,int marks,String name)
	{
		this.age = age;
		this.marks = marks;
		this.name = name;
		
	}
	public int getAge() {
		return age;
	}
	 
	public int getMarks() {
		return marks;
	}
	 
	public String getName() {
		return name;
	}
	 
	
}
public class Example5 {

	public static void main(String[] args)
	{
		Student s = new Student(12,75,"Partha");
		Student s1 = new Student(14,99,"Kadapa");
		Student s2 = new Student(12,75,"Shiva");
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
//		al.add(100); --> Getting error because we are restricting the data to be present in the list
		/// only student objects.
	//	al.add("thsyhs");
		
		
		System.out.println(al);
	}

}
