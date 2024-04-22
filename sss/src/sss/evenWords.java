package sss;

public class evenWords {

	public static void main(String[] args) {
		String s= "hi this is a random string for practise";

		for (String word : s.split(" ")) 
			   if (word.length() % 2 == 0) 
			    System.out.print(word); 
			 } 
	}


