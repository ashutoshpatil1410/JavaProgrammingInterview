package interviewquestions;

public class PalindromeString {

	public static void main(String[] args) {
		
		String value="madam";
		String rev="";
		for(int i=value.length()-1;i>=0;i--) 
		{
			 rev=rev+value.charAt(i);
		}
		 
		if(rev.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else
			System.out.println("Not plindrome String");
	}

}
