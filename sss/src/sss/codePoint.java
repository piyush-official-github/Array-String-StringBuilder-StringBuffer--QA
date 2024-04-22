package sss;

public class codePoint {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer();
		s.append("joinIndiaNavy");
		int unicode = s.codePointAt(7);
		System.out.println("Unicode of Character at index 7 : " + unicode);
	}

}
