package lgeneralization;

public class Cs05_test {

	public static void main(String[] args) {

		Cs02_jio a1 =new Cs02_jio();
		a1.calls();
		a1.data();
		a1.msg();
		a1.jiotv();
		
		System.out.println("sim rate is "+Cs01_trai.sim);
		System.out.println("+++++++++++++++++++");
		
		Cs03_Airtel a2 =new Cs03_Airtel();
		a2.calls();
		a2.data();
		a2.msg();
		a2.music();
		
		System.out.println("sim rate is "+Cs01_trai.sim);
        System.out.println("+++++++++++++++++++");
		
		Cs04_Vi a3 =new Cs04_Vi();
		a3.calls();
		a3.data();
		a3.msg();
		a3.nightnet();
		
		System.out.println("sim rate is "+Cs01_trai.sim);
	}

}
