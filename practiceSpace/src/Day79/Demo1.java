package Day79;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			StringBuilder sb = new StringBuilder(reader.nextLine());
			String s = sb.substring(0, sb.length() - 2);
			System.out.println(s + "i");
		}

		reader.close();
	}

}
