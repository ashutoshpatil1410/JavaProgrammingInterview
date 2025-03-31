package interviewquestions;

public class PalindromeStringAfterRemoving {

	public static void main(String[] args) {
		
		String str="alevela";
		//str.length();
		
		String newstring=str.substring(1,str.length()-1);
		 String copystring=newstring;
		 String reversestring="";
//		System.out.println(newstring);
		
		for(int i=newstring.length()-1;i>=0;i--)
		{
			char ch=newstring.charAt(i);
			reversestring=reversestring+ch;
		}
		if(reversestring.equals(copystring))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("Not palindrome string");
		}
		

	}

}
