package Day113;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();

		reader.nextLine();
		String line = reader.nextLine();
		String[] strs = line.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = n, j = 0; i >= 0; i--, j++) {
			if (!strs[j].equals("0")) {
				if (i > 1) {
					if (strs[j].charAt(0) != '-') {
						sb.append("+");
					}
					if (strs[j].equals("-1")) {
						sb.append("-");
					} else if (!strs[j].equals("1")) {
						sb.append(strs[j]);
					}
					sb.append("x^").append(i);
				} else if (i == 1) {
					if (strs[j].charAt(0) != '-') {
						sb.append("+");
					}
					if (strs[j].equals("-1")) {
						sb.append("-");
					} else if (!strs[j].equals("1")) {
						sb.append(strs[j]);
					}
					sb.append("x");
				} else {
					if (strs[j].charAt(0) != '-') {
						sb.append("+");
					}
					sb.append(strs[j]);
				}
			}
		}
		if (sb.charAt(0) == '+') {
			sb.delete(0, 1);
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
