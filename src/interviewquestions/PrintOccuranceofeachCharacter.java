package interviewquestions;

import java.util.HashMap;

public class PrintOccuranceofeachCharacter {

	public static void main(String[] args) {
		
		String value="aaabbbccdddd";
		HashMap<Character, Integer>charcount=new HashMap<>();
		for(char ch:value.toCharArray())
		{
			charcount.put(ch, charcount.getOrDefault(ch, 0)+1);
		}
		System.out.println(charcount);
	}

}

