import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {

		// ask user for password with parameters
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a password that contains:");
		System.out.println("- at least one lowercase letter");
		System.out.println("- at least one uppercase letter");
		System.out.println("- at least 7 characters");
		System.out.println("- a maximum of 12 characters");
		System.out.println("- an exclamation point (!)" + "\n");
		System.out.print(" Please enter your password here: ");
		String password = scan.next();
		System.out.println(" ");

		// check length of String
		if (password.length() < 7 || password.length() > 12) {
			System.out.println("ERROR");
			return;
		}
		// check for '!'
		if (password.indexOf('!') == -1) {
			System.out.println("ERROR");
			return;
		}
		// check password for uppercase and lowercase
		boolean foundUp = false;
		boolean foundLow = false;

		for (int index = 0; index < password.length(); index++) {
			char letter = password.charAt(index);

			if (Character.isUpperCase(letter)) {
				foundUp = true;
			}
			if (Character.isLowerCase(letter)) {
				foundLow = true;
			}
		}

		if (foundUp && foundLow == true) {
			System.out.println("Password valid and accepted!");

		} else {
			System.out.println("ERROR");
		}

	}
}
