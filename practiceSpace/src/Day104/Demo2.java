package Day104;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		List<Character> lower = new ArrayList<>();
		List<Character> upper = new ArrayList<>();
		List<Character> digits = new ArrayList<>();
		for (char ch : chs) {
			if (ch>='a' && ch<='z') {
				lower.add(ch);
			}else if (ch>='A'&&ch<='Z') {
				upper.add(ch);
			}else {
				digits.add(ch);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Character character : lower) {
			sb.append(character);
		}
		for (Character character : digits) {
			sb.append(character);
		}
		for (Character character : upper) {
			sb.append(character);
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
