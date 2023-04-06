import java.util.ArrayList;

public class ArrayListInbm 
{

	public static void main(String[] args) 
	{
		 ArrayList al = new ArrayList();
		 
		 al.add(11);
		 al.add(22);
		 al.add(33);
		 al.add(44);
		 
		 System.out.println(al);
		 
		 System.out.println(al.contains(44));
		 
		 int index = al.indexOf(22);
		 System.out.println(index);
		 
		 System.out.println(al.isEmpty());
		 
 
		 System.out.println(al.size());
		 System.out.println(al.getClass());
		 
		 al.ensureCapacity(100);
		 System.out.println(al.size());
		 al.remove(2);
		 System.out.println(al);
		 al.removeAll(al);
		 System.out.println(al);
		 

	}

}
