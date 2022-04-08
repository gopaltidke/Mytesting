package iAccess_Specifier;

public class Cs01_Private {

	private void test01() {
		System.out.println("A for apple");
	}
	
	public static void main(String[] args) {

		Cs01_Private a = new Cs01_Private();
		a.test01();
	}

}
