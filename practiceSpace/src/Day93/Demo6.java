package Day93;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char c = reader.nextLine().charAt(0);
		if (c >= 'A' && c <= 'Z') {
			c += 32;
		} else if (c >= 'a' && c <= 'z') {
			c -= 32;
		}
		System.out.println(c);
		reader.close();
	}

}
