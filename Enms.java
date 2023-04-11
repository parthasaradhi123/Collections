

// A group of similiar named constants or predefined constants is called Enums.

//NORTH,SOUTH,EAST,WEST.
//MALE,FEMLAE,OTHERS.
//SUN,MON,TUE,WED,THU,FIR,SAT
//JAN,FRB,MAR,---------DEC.
//PASS,FAILMNR.
//PLANTS

enum Result
{
	PASS,FAIL,NR;  // BY DEFAULT ALL THESE VARIABLES ARE STATIC FINAL.
}

enum Gender
{
	MALE,FEMALE,OTHERS; // IT IS MANDATORY TO WRITE THESE VARIABLES IN CAPITAL LETTERS.
	                    // AND ALL THESE VARIABLES ARE OUR OWN DATA TYPE OR ENUMERATED DATA.
	
	//inside enum we can have methods.
	//inside enum we can have fields, constructors.
	
}

enum Compass
{
	EAST,WEST,NORTH,SOUTH; //WE CANNOT CHANGE CONSTANT VALUES.
}

class Demo2
{
	final int PASS= 100;
	enum Compass11
	{
		EAST,WEST,NORTH,SOUTH; //WE CANNOT CHANGE CONSTANT VALUES.
	}

	// if you simly write pass compiler will give left and right.
 	

}
 
interface Hema 
{
	enum Partha
	{
		 HI,HELLO,NAMASTE;
	}
}




public class Enms 
{
	public static void disp()
	{
		System.out.println("hello namste");
		
	}

	public static void main(String[] args) 
	{
		
		
	
		
		// WE CANNOT DEFINE A ENUM INSIDE A MAIN METHOD WE CAN DEFINE IT OUTSIDE MAINMETHOd
		// OR INSIDE ANY STATIF FIELD or inside any INTERFACE.
		
		
		

	}

}
