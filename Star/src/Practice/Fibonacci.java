package Practice;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=10 ,FN=0,SN=1;
	System.out.println("Fabonaci series:"+n);

	for (int i=0;i<=n;i++) {
		
	System.out.println(FN+", ");
	
	int NextT=FN+SN;
	FN=SN;
	SN=NextT;
	}
	}

}
