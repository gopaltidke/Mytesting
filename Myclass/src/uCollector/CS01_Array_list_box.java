package uCollector;

import java.util.ArrayList;

public class CS01_Array_list_box {
	
	public static void main(String[] args) {
ArrayList al= new ArrayList<>();
		
		al.add("Velocity");
		al.add(123.123);
		al.add('A');
		al.add(null);
		al.add("Pune");
		al.add('B');
		al.add('B');
		al.add(null);
		//simple method to add index value
		System.out.println(al);
		System.out.println(al.size());
		
       al.add(6, "good");	
       
		al.remove(7);
		
		System.out.println(al);

		System.out.println(al.contains("P"));//show boolean value exact valueand case sensitive 
		
		System.out.println(al.isEmpty()); //show boolean value check all fields is empty or not
		
    	System.out.println(al.get(6)); //show which no which value present
    	
    	
		
	}

}
