package global;

import java.util.Arrays;
import java.util.Scanner;

public class T7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		reader.nextLine();
		String line1 = reader.nextLine();
		String line2 = reader.nextLine();
		StringBuilder sb = new StringBuilder();
		char[] add = line2.toCharArray();
		Arrays.sort(add);
		int j = 0;
		for (int i = 0; i < line1.length(); i++) {
			char c = line1.charAt(i);
			while (j < m && add[j] < c) {
				sb.append(add[j++]);
			}
			sb.append(c);
		}
		while (j < m) {
			sb.append(add[j++]);
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
