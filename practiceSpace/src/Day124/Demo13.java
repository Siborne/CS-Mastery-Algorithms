package Day124;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String line1 = reader.nextLine();
		String line2 = reader.nextLine();
		Set<Character> set = new HashSet<>();

		for (char c : line2.toCharArray()) {
			set.add(c);
		}

		char[] letters = new char[set.size()];
		int i = 0;
		for (char c : set) {
			letters[i++] = c;
		}

		StringBuilder sb = new StringBuilder();
		char[] chs = line1.toCharArray();
		for (char c : chs) {
			boolean flag = true;
			for (char letter : letters) {
				if (c == letter) {
					flag = false;
					break;
				}
			}
			if (flag) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
