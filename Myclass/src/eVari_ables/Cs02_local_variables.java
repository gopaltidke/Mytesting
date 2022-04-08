package eVari_ables;

public class Cs02_local_variables {
	
	public void test01()
	{
		int a=10;
		int b=20;  //local variables
		System.out.println("the value of a "+a);
		System.out.println("the value of a "+b);
	}

	
	public static void test02()
	{
		int a=11;
		int b=21;
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
	}
	
	
	public static void main(String[] args) {
		
		Cs02_local_variables e1 =new Cs02_local_variables();
		e1.test01();
		
		test02();
		
		
	}	
}
