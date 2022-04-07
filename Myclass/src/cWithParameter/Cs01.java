package cWithParameter;

public class Cs01 {

	public static void main(String[] args) {
		
//       Cs02without.addi01(); // without parameter static method call from different class
//     
//       Cs02without a1 =new Cs02without();
//       a1.addi02();       // without parameter non static method call from different class
	
      
	   
	   
	   Cs03withparameter a1 =new Cs03withparameter();
			 
	   a1.addi03(10, 20, 30);  // non static method call from different class
	   a1.addi03(20, 450, 880);
			   
	   Cs03withparameter.addi03(20, 40); // static method call from different class
       Cs03withparameter.addi03(100,100);
	   Cs03withparameter.addi03(1000, 1000);
	
	
	
	}

}
