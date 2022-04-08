package pra02;

public class Csc01 {
	public static void main(String[] args) {
		
	
	String s= "Sagar Bhau";// costant statement without new keyword using
	String s1=" Sagar Bhau";
	System.out.println(s.equals(s1));
	
	
	String a  = new String("Samrat Bhau"); // non constant with new key 
	String a1 = new String("Samrat Bhau"); 
	System.out.println(a.equals(a1));
	System.out.println(a==a1);
	System.out.println(a.charAt (10));
	System.out.println(a.concat (s1));
	
	}
}
