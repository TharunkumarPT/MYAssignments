package class1.day2.assignments;

public class FindEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxValue=20;
		for(int i=0;i<=maxValue;i++) {
			if(i%2==0) {
				System.out.println("Even numbers are: " + i);
			}
		}

		for(int i=0;i<=maxValue;i++) {
			if(i%2!=1) {
				System.out.println("Even numbers are present");
			}
		}
	}

}
