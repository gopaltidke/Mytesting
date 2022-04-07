package Run;

public class Son extends Motherr {

	public static void main(String[] args) {
         Motherr e1 = new Motherr();
         e1.Bike();
         e1.money();
         Son e2 = new Son();
         e2.Bike();
         e2.money();
	}

	public void money()
	{
		System.out.println("1 thousand");
	}
	public void Bike() {
		System.out.println("Pursona");
	}
}
