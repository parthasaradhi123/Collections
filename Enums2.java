

enum Result12
{
	PASS,   //-->public static final Result PASS = new Result()	;
	FAIL,NR;
	
	//static final Result12 HELLO = new Result12();
	
	
	Result12()
	{
		System.out.println(":: Constructor is called  ::");
	}
	
	public void disp()
	{
		System.out.println("namaste");
	}
	
}



public class Enums2 
{

	public static void main(String[] args) 
	{
		Result12 res =Result12.PASS;
		System.out.println(res);
		
		Result12[] res1 = res.NR.values();
		//The return type of values is array.
		System.out.println("=======================================");
		
		for(Result12 arr:res1)
		{
			System.out.println(arr.ordinal()+" : "+arr.name());
		}
		
		
		
		//System.out.println(res1[1]);
		
	}

}
