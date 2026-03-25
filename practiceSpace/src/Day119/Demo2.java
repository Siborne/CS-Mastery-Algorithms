package Day119;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			reader.nextLine();
			String s = reader.nextLine();

			int maxLength = 1;
			int currentLength = 1;

			for (int i = 1; i < n; i++) {
				if (s.charAt(i) == s.charAt(i - 1)) {
					currentLength++;
					maxLength = Math.max(maxLength, currentLength);
				} else {
					currentLength = 1;
				}
			}
			System.out.println(maxLength + 1);
		}
		reader.close();
	}

}
