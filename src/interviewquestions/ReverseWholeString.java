package interviewquestions;

public class ReverseWholeString {

	public static void main(String[] args) {
		
		String name="ashutosh sanjay patil";
		System.out.println(name.length());
		name=name+" ";
		String word="";
		String revString="";
		System.out.println(name.length());
		
//		ashutosh sanjay patil
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch!=' ')
			{
				word=word+ch;
			}
			else {
				revString=word+" " +revString;
				word="";
			}
		}
		System.out.println(revString);

	}

}
