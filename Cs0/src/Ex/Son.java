package Ex;

public class Son extends Mother {
	
public static void main(String[] args) {
    //upcasting
	Mother M = new Son();
	M.money();
	M.Bike();	
}
	 public void money() {
		System.out.println("Paisa 1khoka");
	 }
	public void Bike()
	{
		 System.out.println("1 home");
	}
     public void car()
     {
    	 System.out.println("Car");
     }
}
