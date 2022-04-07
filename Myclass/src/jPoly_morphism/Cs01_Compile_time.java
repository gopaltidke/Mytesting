package jPoly_morphism;

public class Cs01_Compile_time {

//	int a=520;   compile time polymorphism is a example of overloading
//	int b=620;   method name same but different arguments\parameters are
//	int c=720;   different that is call method overloading aswell as 
//	float a1=820; compile time polymorphism
//	float b1=920;
	
	public void Cs01(float a) {
		System.out.println(""+a);
	}
	public void Cs01(int a) {
		System.out.println(""+a);
	
	}
	public void Cs01(int a,int b) {
		int sum =a+b;
		System.out.println(""+sum);

	}
	public void Cs01(float a,float b) {
		float sum =a+b;
		System.out.println(""+sum);

	}
	public static void main(String[] args) //main method
	{

		Cs01_Compile_time a = new Cs01_Compile_time();
		a.Cs01(0.12f);
		a.Cs01(102);
		a.Cs01(110, 450);
		a.Cs01(0.8711f, 45.540f);
		
	}

}
