package interviewquestions;

public class PalendromeNumber {

	public static void main(String[] args) {
		
		int num=55555555;
		int numcopy=num;
		int rev=0;
		
		while(num>0)
		{
			int digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		if(rev==numcopy)
		{
			System.out.println("number is palindrome number");
		}
		else
		{
			System.out.println("not palindrome number");
		}
	}

}
