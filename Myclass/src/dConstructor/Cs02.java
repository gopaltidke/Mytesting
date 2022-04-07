package dConstructor;

public class Cs02 {
	
  public Cs02() { //this is user
  System.out.println("Running zero parameter constructor");
	}
	
	public static void main(String[] args) {

		Cs02 a =new Cs02();
		//a.test01();
	}

	public void test01()
	{
		System.out.println("Non static method called ");
	}
	
	
}
