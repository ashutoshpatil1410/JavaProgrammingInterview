package interviewquestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="ashutosh";
		
		//with lengh and char
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
			
		}
		System.out.println("\n************************************");
//		without length and charAt
		char a[]=name.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}

	}

}
