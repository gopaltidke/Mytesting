package cStatic_Methods;

public class Cs01 {
	
	public static void test01() {
		
		int a=10;
		int b=10;
	    int sum =a+b;
	    System.out.println("addition is "+sum);		
	}

	public static void main(String[] args) {
		
          test01();    //syntax--> (methodname();) //call from same class
      
      Cs02.test01();    //syntax-->(classname.methodname();)   // call from different class
      Cs02.test02();      // call from different class
      
		
		
	}

}
