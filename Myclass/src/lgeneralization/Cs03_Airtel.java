package lgeneralization;

public class Cs03_Airtel implements Cs01_trai {

	@Override
	public void calls() {
System.out.println("100 min free and then unlimited");		
	}

	@Override
	public void msg() {
System.out.println("50+50 msg per day");		
	}

	@Override
	public void data() {
System.out.println("1.5 gb per day");		
	}

	public void music() {
		System.out.println("Gana free");
	}
	
}
