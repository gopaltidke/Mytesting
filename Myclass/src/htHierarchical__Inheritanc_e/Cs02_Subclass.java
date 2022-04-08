package htHierarchical__Inheritanc_e;

public class Cs02_Subclass extends Cs01_Superclass {
             
	public void Sub_home() {
		System.out.println("Sub ka home");
	} 
	public void Sub_mobile() {
		System.out.println("Sub ka iphone");
	}
	
	
public static void main(String[] args) {

	   Cs02_Subclass a= new Cs02_Subclass();
	   a.Sub_home();
	   a.Sub_mobile();
	   a.Super_money();
	   a.Super_Pocket();
			   
	
}



}


