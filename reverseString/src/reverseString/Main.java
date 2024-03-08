package reverseString;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a = "";
		System.out.println("Enter text");
		String userInput = scanner.next();
		int b = userInput.length() - 1;
		for (int i = b; i >= 0; i--) {
			a += (String.valueOf(userInput.charAt(i)));
		}
		System.out.println(a);
	}

}
