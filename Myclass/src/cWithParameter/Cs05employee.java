package cWithParameter;

public class Cs05employee {
	
	
	
	public static void emp01(String Emp_Name,float Emp_Salary,int Emp_id) // static method
	{
		System.out.println("==========================");
		System.out.println("Employee name "+Emp_Name);
		System.out.println("Employee salary "+Emp_Salary);
		System.out.println("Employee id "+Emp_id);
	}
	public  void emp01(String Emp_Name,int Emp_id) // non static 
	{
		System.out.println("==========================");
		System.out.println("Employee name "+Emp_Name);
		System.out.println("Employee id "+Emp_id);
	}
	

}
