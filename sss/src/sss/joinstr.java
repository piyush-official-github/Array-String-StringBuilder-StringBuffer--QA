package sss;

public class joinstr {

	public static void main(String[] args) {

		String str1 = "this";
	    String str2 = "is";
	    String str3 = "ensence";

	    String joinedStr = String.join(" ", str1, str2, str3);

	    System.out.println(joinedStr);
	}

}
