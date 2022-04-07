package eVari_ables;

public class Cs01_global_variables {

	static int a=10;
	int b=20;  // global 

	
	public void Cs01() //non static method
	{
		int a=100;
		int b=200;	
		int sum =a+this.a;
		System.out.println("addi is " + sum);
		int sub=b-this.b;
	  System.out.println("sub is "+sub);
	  
	}
	
	
	public static void main(String[] args) {
 
		System.out.println("value of a is "+a);
		
		Cs01_global_variables a1 =new Cs01_global_variables();
		
		System.out.println("value of b is "+a1.b);
		
		a1.Cs01();
		
		
	}

}
