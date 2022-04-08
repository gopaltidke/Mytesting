package inn_terface;

public class Cs09Sub_Production implements Cs08Super_Car,Cs07Super_truck {

	public static void main(String[] args) {

		Cs09Sub_Production a = new Cs09Sub_Production();
		a.Bus();
		a.Truck();
		a.car();
		a.minibus();
		
		
	}

	@Override
	public void Truck() {
System.out.println("tata avs adani");		
	}

	@Override
	public void Bus() {
		System.out.println("tata vs l&t");
		
	}

	@Override
	public void car() {
		System.out.println("tata vs maruti");
		
	}

	@Override
	public void minibus() {
		System.out.println("tata vs l&t");
		
	}

}
