package class1.day2.assignments;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] num = {2, 5, 7, 7, 5, 9, 2, 3};
		
		Arrays.sort(num);
		System.out.println("comparing length & values of array using single for loop with iteration and iteration + 1");

		for(int i=0;i<num.length-1;i++) 
		{ 
			if(num[i]==num[i+1]) 
			{
				System.out.println("The duplicate values are:" + num[i]); 
			} 
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("comparing length and values of array using two for loop then printing the duplicates");
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=i+1;j<num.length;j++) {
				if( num[i]== num[j]) {
					System.out.println("Duplicate values are found :" + num[i]);

				}
			}
		}

	}

}
