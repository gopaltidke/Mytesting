package htHierarchical__Inheritanc_e;

public class Cs03_Subclass extends Cs01_Superclass
{
//12-01-2022
	
	public static void Sub_Home() {
		System.out.println("Sub ka ghar");
	}
	public static void Sub_mobile() {
		System.out.println("Sub ka iphone");
	}
	
		public static void main(String[] args) {

			Sub_Home();
			Sub_mobile();
			
			
			   Cs03_Subclass a= new Cs03_Subclass();
			 
			   a.Super_money();
			   a.Super_Pocket();
	}
}
