package sss;

public class reversebuilder {

	public static void main(String[] args) {

		String originalString = "Hello, world!";
        StringBuilder reversedBuilder = new StringBuilder(originalString);
        
        reversedBuilder.reverse();
        String reversedString = reversedBuilder.toString();
        
        System.out.println("Original: " + originalString);
        System.out.println("Reversed: " + reversedString);
	}

}
