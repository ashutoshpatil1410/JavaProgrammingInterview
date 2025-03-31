package interviewquestions;

public class ReverseEachwordOfString {

	public static void main(String[] args) {
		
		//ashutosh sanjay patil
		
		String name="ashutosh sanjay patil konavade";
//					 kanth uoy
		name=name+" ";
		String word="";
		String revword="";
		
		for(int i=0;i<name.length();i++)
		{
//			System.out.print(name.charAt(i));
			
			char ch=name.charAt(i);
			if(ch!=' ')
			{
				word=ch+word;
			}
			else {
				revword=revword+word+" ";
				word="";
			}
			
		}
//		System.out.println(revword);
		System.out.println(revword.trim());

	}

}
