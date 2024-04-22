package sss;

public class appendCodePoint {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("stonepapaerscissor");
		System.out.println("StringBuffer : " + str);
		str.appendCodePoint(72);
		System.out.println("StringBuffer with codePoint : " + str);
	}

}
