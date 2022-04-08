package upcasting;

public class Subclass extends Superclass {
	
public static void main(String[] args) {
	// upcast	
//		Superclass e1 =new Subclass();
//		e1.a();
//		e1.b();
	//object creat normal 
		Subclass e2 =new Subclass();
	    e2.a();
	    e2.b();
	    e2.c();
	  
	}

public void c()
{System.out.println("Chiller");}

public void a()
{System.out.println("ghoda");}

	

}
