package Week4.day1.HomeAssignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String setValue = "google";
		String empty = "";

		char[] ch = setValue.toCharArray();

		Set<Character> s = new LinkedHashSet<Character>();

		//for loop to get the characters in array format
		for(Character companyName : ch)
		{	
			s.add(companyName);

		}
		System.out.println("The output is:" + s);
		
		ArrayList<Character> arr = new ArrayList<Character>(s);
		
		//Nested for loop to get each characters and add it in empty list and print in a normal statement
		for(Character companyNames : arr)
		{	
			
			empty=empty+companyNames;
		}
		System.out.println("The output is:" + empty);
				 	
	}

}
