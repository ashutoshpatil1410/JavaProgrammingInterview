package interviewquestions;

import java.util.HashMap;

public class PrintOccurancesOfEachCharacter1 {

	public static void main(String[] args) {
		
		String value="aabbbccddeeffffffgggggggg";
		
		HashMap< Character, Integer> charcount=new HashMap<>();
		
//		char ch:value.toCharArray()  //This also we can put into for loop
		for(int i=0;i<value.length();i++)
		{
			char ch=value.charAt(i);
			if(charcount.containsKey(ch))
			{
				charcount.put(ch, charcount.get(ch)+1);
			}
			else {
				charcount.put(ch, 1);
			}
		}
		System.out.println(charcount);

	}

}
