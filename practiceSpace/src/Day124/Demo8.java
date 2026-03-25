package Day124;

import java.util.Scanner;

public class Demo8 {

	private static final char[] letters = new char[] { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			reader.nextLine();
			while (n-- > 0) {
				String line = reader.nextLine();
				char[] chs = line.toCharArray();
				int[] lettersSum = new int[5];
				for (char ch : chs) {
					for (int i = 0; i < 5; i++) {
						if (ch == letters[i]) {
							lettersSum[i]++;
							break;
						}
					}
				}
				for (int i = 0; i < lettersSum.length; i++) {
					System.out.println(letters[i] + ":" + lettersSum[i]);
				}
				System.out.println();

			}
		}

		reader.close();
	}

}
