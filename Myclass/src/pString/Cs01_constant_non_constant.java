package pString;

public class Cs01_constant_non_constant {
	//constatnt pool area
//	String n1="velocity";
//	String n2="katraj";   //global veriable
//	String n3="pune";
//	String n4="puna";
//	String n5="velocity";
	
	public static void main(String[] args) {
		String n1= new String("velocity");
		
		String m1= new String("velocity");
		
		String n2="katraj";   
		String n3="pune";
		String n4="puna";
		String n5= "velocity";
		String n6= "velocity";
		String n7= "Velocity";
		
//		System.out.println(n1==m1);//check memory location check after value(same memory location)
//		System.out.println(n1.equals(m1));//check value
		//System.out.println(n7.equalsIgnoreCase(n6));
		//System.out.println(n2.charAt(5));
		System.out.println(n5.contains(n7));
		
	}
	


}
