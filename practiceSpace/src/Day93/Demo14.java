package Day93;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		char c = reader.next().charAt(0);

		if (c >= '0' && c <= '9') {
			System.out.println("Number");
		} else if (c >= 'A' && c <= 'Z') {
			System.out.println("Capital letter");
		} else if (c >= 'a' && c <= 'z') {
			System.out.println("Lowercase letter");
		} else if (c == '+' || c == '-' || c == '*' || c == '/') {
			System.out.println("Arithmetic operators");
		} else if (c == '=' || c == '>' || c == '<') {
			System.out.println("Relational operators");
		} else if (c == '!' || c == '&' || c == '|' || c == '^') {
			System.out.println("Logical operators");
		} else {
			System.out.println("Other character");
		}

		reader.close();
	}

}
