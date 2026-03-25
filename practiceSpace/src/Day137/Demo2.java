package Day137;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();
		reader.nextLine();
		String line = reader.nextLine();
		char[] chs = line.toCharArray();

		int upperCase = 0;
		for (char ch : chs) {
			if (Character.isUpperCase(ch)) {
				upperCase++;
			}
		}
		int smallCase = n - upperCase;
		int convert = Math.min(k, smallCase);
		upperCase += convert;
		k -= convert;

		if (k > 0) {
			upperCase -= k % 2;
		}
		System.out.println(upperCase);
		reader.close();
	}

}
