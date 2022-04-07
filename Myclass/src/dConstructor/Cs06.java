package dConstructor;

public class Cs06 {
	int a;
	int b;
	int c;
	
	public Cs06(int d)  
	{
		a=d;
	}
	
	
	public Cs06(int d,int e )
	{
		a=d;
		b=e;	
	}
	public Cs06(int d,int e,int f) 
	{
		a=d;
		b=e;
		c=f;
	}
	
	public void sub()
	{
		int sub =a-b-c;
		System.out.println("sub is "+sub);
	}
	
	public void addition ()
	{
		int sum =a+b+c;
		System.out.println("addition is "+sum);
	}
	public static void main(String[] args) {

		Cs06 m2 =new Cs06(122);
		m2.sub();
		
		Cs06 m3 =new Cs06(1120,1120);
		m3.sub();
		
		Cs06 m4 =new Cs06(100, 500, 800);
		m4.sub();
		
		Cs06 a2 =new Cs06(122);
		a2.sub();
		
		Cs06 a3 =new Cs06(1120,1120);
		a3.addition();
		
		Cs06 a4 =new Cs06(100, 500, 800);
		a4.addition();
		
	}

}