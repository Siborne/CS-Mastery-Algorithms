package Day75;

import java.util.Scanner;

public class Demo22 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line = reader.nextLine();
		for (int i = line.length() - 1; i >= 0; i--) {
			System.out.print(line.charAt(i));
		}

		reader.close();
	}

}
