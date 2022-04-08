package fControl_statements;

public class Cs05_nestted {
	
public static void main(String[] args) {
	

	String Username="Velocity";
	String Pass="123";
	
	if (Username=="elocity") {
		
		System.out.println("Correct Username plz enter password ");
		
		if (Pass=="123") {
			
			System.out.println("Login successful");
			
		} 
		else {
			System.out.println("Wrong password, plz check password");
			}
		
}
	else {
		System.out.println("Incorrect username, unable to login");

	}
	

}

}


