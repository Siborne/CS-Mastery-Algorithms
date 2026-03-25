package Day124;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int distance = 'a' - 'A';
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			String[] s = line.split("\\s+");
			for (int i = 0; i < s.length; i++) {
				s[i] = s[i].replaceFirst(String.valueOf(s[i].charAt(0)), String.valueOf((char)(s[i].charAt(0) - distance)));
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < s.length; i++) {
				if (i > 0) {
					sb.append(" ");
				}
				sb.append(s[i]);
			}
			System.out.println(sb.toString());
		}
		reader.close();
	}

}
