package sss;

public class firstLetter {

	public static void main(String[] args) {

		String firstName = "Piyush";
        String middleName = "Chandra";
        String lastName = "Hiroo";
        String init = firstName.substring(0,1) +
                          middleName.substring(0,1) +
                          lastName.substring(0,1);
        System.out.println(init.toLowerCase());
	}

}
