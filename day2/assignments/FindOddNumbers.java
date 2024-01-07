package class1.day2.assignments;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxValue = 10;
		for(int i=0;i<=maxValue;i++) 
		{
			if(i%2==1) 
			{
				System.out.println("The value is odd number:" + i);
			}
			else {
				System.out.println("The value is even number");
			}
		}
		System.out.println("Coming out of 1st loop with equal condition");
		for(int i=0;i<maxValue;i++) 
		{
			if(i%2!=0)
			{
				System.out.println("The value is odd number:" + i);
			}
		}
		System.out.println("Coming out of 2nd loop with not equal condition");
	}

}
