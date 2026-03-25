package Day120;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line = reader.nextLine();
		for (int i = 0; i <= 9; i++) {
			line = line.replaceAll(String.valueOf(i), "number");
		}
		System.out.println(line);
		reader.close();
	}

}
