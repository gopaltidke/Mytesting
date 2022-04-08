package inn_terface;

public class Cs02 implements Cs01 {
//	int a=10;     //you don't need to use static because interface 
//	int b=20;     //is static and final
//	int d=40;
	
	public static void main(String[] args) 
	{
        Cs02 b = new Cs02();
        b.test02();
        b.test03();
        b.test04();	
        b.test05();
        
	}

	@Override
	public void test02() {

		int sum=a+b+d;
		System.out.println("sum is "+sum); 
	}

	@Override
	public void test03() {
		int a =100;
		int b =300;
		int sub=this .a +this.b;
		System.out.println("global call-->sub is"+sub);
		System.out.println("local---> "+(a*b));
	}

	@Override
	public void test04() {
		System.out.println("mul is"+this.a*this.b);
	}

}
