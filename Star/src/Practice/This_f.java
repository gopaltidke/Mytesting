package Practice;

public class This_f {
    int a=20;
	int b=30;
	static int c =50;
	
        public void Test() {
    	//int a=21;
    	System.out.println(""+this.a);
	}		
	    
        public void test01() {
		int sub=a+this.b;
		System.out.println(""+sub);
	} 
	    
	    public static void main(String[] ghggh) {
        This_f a = new This_f();
		a.Test();
		a.test01();
	}
    }

