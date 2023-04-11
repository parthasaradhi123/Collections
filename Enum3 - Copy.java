
enum Course
{
	JAVA,JEE,SPRINGBOOT,MYSQL,JDBC;
	
	int courseId;
	
	Course()
	{
		System.out.println(": Constructor : ");
	}
	
	void setCourseId(int courseId)
	{
		this.courseId = courseId;
	}
	int getCourseId()
	{
		return courseId;
	}
}
public class Enum3 {

	public static void main(String[] args)
	{
		 Course c = Course.JAVA;
		 
		 c.setCourseId(10);
		 
		 System.out.println("=============================");
		 int x =  c.getCourseId();
		 
		 Course ar[] = c.values();
		 
		 System.out.println(x);
		 System.out.println(ar[0]);
		 System.out.println(ar[1]);
		 System.out.println(ar[2]);
		 System.out.println(ar[3]);
		 System.out.println(ar[4]);
		  
		 System.out.println("==================================");
	}

}
