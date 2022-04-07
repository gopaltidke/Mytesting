package kCasting;

public class Cs03 {
	
	public static void main(String[] args) {
	  // Cs02_Son a = new Cs01_father_Upcasting(); it is not possible we cants 
		// inherited son property into father// aapna son class chya property father class 
		// la deu shakat nahi
		Cs01_father_Upcasting a = new Cs02_Son();
		
		a.money();
		a.car();
	
	}

}
