package interviewquestions;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=90;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;	
			}
		}
		if(count>2)
		{
			System.out.println("Not a prime number means composite number");
		}
		else {
			System.out.println("Prime number");
		}
	}

}
