package interviewquestions;

public class PrintOccurancesOfoneCharacter {

	public static void main(String[] args) {

		String value = "hello madam how are you";
		char key = 'u';
		int count=0;
		for (int i = 0; i < value.length(); i++)
		{

			if (key==value.charAt(i)) 
			{
				count++;
			}
		}

		System.out.println(count);
	}

}
