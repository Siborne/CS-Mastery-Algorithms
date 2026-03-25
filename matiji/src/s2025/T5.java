package s2025;

import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s = reader.nextLine();
		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			String str = reader.nextLine();
			int i = 0;
			int j = 0;
			
			while (i < s.length() && j < str.length()) {
				if (s.charAt(i) == str.charAt(j)) {
					i++;
					j++;
				} else {
					i++;
				}
			}
			if (j==str.length()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
