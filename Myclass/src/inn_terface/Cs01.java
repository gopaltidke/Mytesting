package inn_terface;

public interface Cs01 {
   
	int a=10;     //you don't need to use static because interface 
	int b=20;     //is static and final
	int d=40;
	
	public static void main(String[] args)
	{
		test01();	//interface call only static methods
	}
	
	public static void test01()
	{   int c=30;
		int sum=a+b+c+d;
		System.out.println(""+sum);	
	}
	
	
	public void test02();
	public void test03();
	public void test04();
	
	public default void test05() {
		int Qa=4578;
		System.out.println("NOn static complete method to interface class "+Qa);
	}
	
	
	

}
