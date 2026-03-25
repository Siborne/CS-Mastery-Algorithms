package Day97;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String b = reader.nextLine();
		if (b.length() <= 3) {
			System.out.println(b.substring(0, 2));
			return;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(b.substring(0, 2));
		for (int i = 3; i < b.length(); i += 2) {
			sb.append(b.charAt(i));
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
