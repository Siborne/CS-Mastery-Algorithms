package Day103;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char c = reader.next().charAt(0);
		if (c == 'U' || c == 'D') {
			System.out.println("L");
		} else {
			System.out.println("U");
		}

		reader.close();
	}

}
