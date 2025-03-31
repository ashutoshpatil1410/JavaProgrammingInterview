package interviewquestions;

public class ReverseStringonlycharacternotword {

	public static void main(String[] args) {
		
		String str ="ashutosh sanjay patil";
		str=str+" ";
		String reverseword="";
		String reversestring ="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				reverseword=ch+reverseword;
			}
			else {
				if(reversestring.isEmpty())
				{
					reversestring=reverseword;
				}
				else {
					reversestring=reversestring+" "+reverseword;
				}
				
				reverseword="";
			}
		}
		System.out.println(reversestring);
		
	}

}
