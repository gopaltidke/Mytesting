package my_interferece;

public class Cs02 implements Cs03 {
public static void main(String[] args) {
Cs02 A1 = new Cs02();
	A1.bike();
	A1.money();
	A1.Knoledge();
	A1.Score();

}
	@Override
	public void money() {
System.out.println("Nach meri jan to paisa milega");		
	}

	@Override
	public void Knoledge() {
		System.out.println("Padego likhoge to honge nawab");
		
	}

	@Override
	public void bike() {
 System.out.println("maut ka kua");
		
	}

	@Override
	public void Score() {
		System.out.println("Century");
		
	}

	
}	

