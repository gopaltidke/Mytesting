package inn_terface;

public class Cs05Child implements Cs04mother,Cs03Father {

	public static void main(String[] args) {

		Cs05Child a =new Cs05Child();
		a.father_money();
		a.father_Bike();
		a.mother_recipi();
		a.mother_lapi();
		
	}

	@Override
	public void father_money() {
System.out.println("sons money");		
	}

	@Override
	public void father_Bike() {
		System.out.println("sons bike");
		
	}

	

	@Override
	public void mother_recipi() {
		System.out.println("sons recipi");
		
	}

	@Override
	public void mother_lapi() {
		System.out.println("sons lapi");
		
	}

	

	

}
