package Day124;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line1 = reader.nextLine();
		String line2 = reader.nextLine();
		String res = line1 + line2;
		System.out.println(res);

		reader.close();
	}

}
