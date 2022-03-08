import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		boolean valid = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello and Welcome to the Password Checker by Bolanle Aduroja." +"\n");
		System.out.println("When you would like to exit the program, type EXIT in all capital letters.");
		System.out.println("Otherwise, follow the instructions below." + "\n" );
		do {
			// ask user for password with parameters
			
			System.out.println("Please enter a password that contains:");
			System.out.println("- at least one lowercase letter");
			System.out.println("- at least one uppercase letter");
			System.out.println("- at least 7 characters");
			System.out.println("- a maximum of 12 characters");
			System.out.println("- an exclamation point (!)" + "\n");
			System.out.print(" Please enter your password here: ");
			String password = scan.next();
			System.out.println("");
			
			//allow user to exit program
			if (password.equals("EXIT")|| password.equals("EXIT ")|| password.equals("Exit") || password.equals("exit")||password.equals("Exit ")||password.equals("exit ")) {
				System.out.println("Thank you for using the Password Checker.");
				scan.close();
				return;
			}

			// check length of String
			if (password.length() < 7 || password.length() > 12) {
				System.out.println("Error" + "\n");
				continue;
				
			}
			// check for '!'
			if (password.indexOf('!') == -1) {
				System.out.println("Error"+ "\n");
				continue;
				
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
				valid = true;
				System.out.println("Password valid and accepted");
	
			} else {
				
				System.out.println("Error" + "\n");
				continue;
			}
			
			
		}while (valid == false);
		scan.close();
	}
}
