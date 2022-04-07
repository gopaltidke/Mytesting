package cs01;

public class Cs02 {

	public static void main(String[] args) {
        String a ="Ratnagiri";
        String a1 ="Ratna";
        String a2 ="ratnagiri";
        String a3 ="Ratnagiri"; //Constant pool
        
        String e =new String ("Ratnagiri");
        String e1 =new String ("Ratna");
        String e2 =new String ("ratnagiri");
        String e3 =new String ("Ratnagiri");
		
       System.out.println(a==a2);   //location check but same name
       System.out.println(e.equals(e3)); //content memory value
       
       
	}

}
