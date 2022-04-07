package cNonStatic_Methods;

public class Cs01 {
	
	public static void main(String[] args) {
		
		Cs01 a1 = new Cs01(); //creat object first and then object.methodname(); 
		a1.test01();      //  non static regular method call from same class )
		a1.test02();     //
		
		Cs02 a2 = new Cs02(); //non-static method call from another class
		a2.test01();          // first object which class you want to call
		a2.test02();          // and then call object.methodname you want call
	}
	
	
	public void test01() {  // non static method
		int a =10;
		int b=20;
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	public void test02() {   // non static method
		System.out.println("non static regular method running from same class " );
	}

}
