package Day113;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String midLine = reader.nextLine();
		String nextLine = reader.nextLine();
		tree(midLine, nextLine);
		reader.close();
	}

	private static void tree(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > 0) {
			char ch = s2.charAt(len2 - 1);
			System.out.print(ch);
			int pos = s1.indexOf(ch);
			tree(s1.substring(0, pos), s2.substring(0, pos));
			tree(s1.substring(pos + 1), s2.substring(pos, len1 - 1));
		}
	}

}
