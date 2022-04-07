package stringt_ypes;

public class Cs01 {

	public static void main(String[] args) {
		String a1 = "Velocityo ";
		String a2 = "carpate ";
		String a3= "Training ";
		String a4 = "Centre ";
		String a5 = "babhulgaon";
 
		//System.out.println(a1.lastIndexOf('o'));
		
		System.out.println(a1.concat(a1));
        System.out.println("index of "+a1.concat(a2).concat(a3).concat(a4).concat(a5));
              
        String a6 = (a1.concat(a2).concat(a3).concat(a4).concat(a5));
               //System.out.println(a6);
        System.out.println(a6.lastIndexOf('a'));
               //System.out.println(a1.indexOf(1));
               //System.out.println(a1.indexOf(2));
               //System.out.println(a1.indexOf('y'));
               // index no of character
        
        System.out.println(a6.replace('T','S'));
        System.out.println(a6.replace("Centre", "Santre"));
        System.out.println(a6.replace("babhulgaon", "Pune"));
        System.out.println(a6.replaceAll(a5, "aalu"));
        System.out.println(a6.replaceFirst(a5, "Bhatukali"));
	    }

}
  