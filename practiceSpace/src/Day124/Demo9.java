package Day124;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			reader.nextLine();
			while (n-->0) {
				String orginString = reader.nextLine();
				StringBuilder sb = new StringBuilder(orginString);
				String reverseString = sb.reverse().toString();
				if (orginString.equals(reverseString)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		}

		reader.close();
	}

}
