package interviewquestions;

public class LongestWord {

	public static void main(String[] args) {
		
		String str ="ashutosh sanjay patil";
		str=str+" ";
		String word="";
		String longestword="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				word=word+ch;
			}
			else {
				if(word.length()>longestword.length())
				{
					longestword=word;
					
				}
				word="";
			}
		}
		System.out.println("Longest word "+longestword);
		

	}

}
