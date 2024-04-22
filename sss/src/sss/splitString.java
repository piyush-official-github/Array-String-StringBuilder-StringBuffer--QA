package sss;

public class splitString {

	public static void main(String[] args) {

		String text = "Java is a good programming language";

	    String[] result = text.split(" ");


	    System.out.print("result = ");
	    for (String str : result) {
	      System.out.print(str + ", ");
	    }
	}

}
