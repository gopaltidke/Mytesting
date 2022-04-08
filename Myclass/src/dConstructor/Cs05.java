package dConstructor;

public class Cs05 {
	
	int a;
	int b;
	int c;
	
//	public Cs05()  // zero parameter 
//	{
//		a=10;
//		b=20;
//		c=30;
//	}
	
	public Cs05(int num1)
	{
		a=num1;
		int sum =a+b+c;
		System.out.println("addition is "+sum);
	}
	public Cs05(int num1,int num2 )
	{
		a=num1;
		b=num2;	
		int sum =a+b+c;
		System.out.println("addition is "+sum);
	}
	public Cs05(int num1,int num2 ,int num3) 
	{
		a=num1;
		b=num2;
		c=num3;
		int sum =a+b+c;
		System.out.println("addition is "+sum);
	}
	
//	public void addition ()
//	{
//		int sum =a+b+c;
//		System.out.println("addition is "+sum);
//	}
	public static void main(String[] args) {

		
		Cs05 a1 =new Cs05(10);
		//a1.addition();
		
		Cs05 a2 =new Cs05(12);
		//a2.addition();
		
		Cs05 a3 =new Cs05(120,120);
	//	a3.addition();
		
		Cs05 a4 =new Cs05(10, 50, 80);
	//	a4.addition();
		
	}

}
