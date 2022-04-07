package dConstructor;

public class Cs04_Con_Zero {
	
	int a; //variable declarartion
	int b; //variable declarartion
	
	public Cs04_Con_Zero()  //constructor -->Zero parameter
	{
	a=50; //variable initialization
	b=70; //variable initialization
	System.out.println("constructor is running");
	System.out.println("vallue of a is "+a);
	System.out.println("value of b  is "+b);
	}
	
	public static void main(String[] args) 
	{
      	Cs04_Con_Zero e1 =new Cs04_Con_Zero();
      	
	}

}
