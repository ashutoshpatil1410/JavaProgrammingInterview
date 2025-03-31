package interviewquestions;

import java.util.HashMap;

public class CountWordOccurances {

	public static void main(String[] args) {
		
		String str ="my name is lakhan my name";
		
		String [] words=str.split(" ");
		
		HashMap<String, Integer> wordcount=new HashMap<>();
		
		for(String word:words)
		{
			if(wordcount.containsKey(word))
			{
				wordcount.put(word, wordcount.get(word)+1);
				
			}
			else {
				wordcount.put(word, 1);
			}
		}
		System.out.println(wordcount);

	}

}
