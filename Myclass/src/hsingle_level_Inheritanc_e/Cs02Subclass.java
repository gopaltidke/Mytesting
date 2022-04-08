package hsingle_level_Inheritanc_e;

public class Cs02Subclass extends Cs01Superclass{
	int a=500;// global variable of class B
	
	
public void display()
{
	int a=200;// local variable
	
	System.out.println("Local value of a is "+a);// calling local value
	System.out.println("Global value of a from same class is using this key "+this.a);// calling global value of same class
	System.out.println("Global value of a from Super class is using super key "+super.a);//calling global value of Super class
}


	public void mobile() {
		System.out.println("Subclass mobile");}
	
		public void lapi() {
			System.out.println("Sub lapi");
		}
		
		public static void main(String[] args) {
			Cs02Subclass a =new Cs02Subclass();
			a.lapi();
			a.mobile();
			a.home();
			a.money();
	
			Cs02Subclass b = new Cs02Subclass();
			b.display();
		
		}
		
	}


