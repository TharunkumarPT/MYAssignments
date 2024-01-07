package class1.day2.assignments;

public class ForrLoop {

	public static void main(String[] args) {

		int num=10;
		String abc = "Charles";
		String backwards = "";

		//i++ -post increment-once iteration its completed it will increment

		//++i -pre increment-before iteration completed it will increment

		//for-ctrl+ space => select 2nd option

		for (int i = 0; i <num; i++) {

			System.out.println(i);
		}

		System.out.println("************************************");

		for (int i = num; i >=0; i--) {

			System.out.println(i);
		}


		//Reverse each character of a string
		System.out.println("---------------Reverse the string and display each character while reversing--------");
		for(int i= abc.length() -1; i>=0;i--) {	
			char a =abc.charAt(i);
			backwards = backwards + a;

			System.out.println("The reverse character values are:" + backwards);
		}

		//Reverse the string
		System.out.println("---------------Reverse the string  and display it--------");
		String name = "Welcome";
		String res = "";
		for (int i = name.length()- 1; i >= 0; i--)  { 
			char ch = name.charAt(i);
			res = res + ch;
		}
		System.out.println(res);



	}

}
