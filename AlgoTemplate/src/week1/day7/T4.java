package week1.day7;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();

		int eqIdx = s.indexOf("=");
		String left = s.substring(0, eqIdx);
		String strC = s.substring(eqIdx + 1);

		int opIdx = -1;
		for (int i = 0; i < left.length(); i++) {
			char ch = left.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '?') {
				if (i > 0) {
					opIdx = i;
					break;
				}
			}
		}

		String strA = left.substring(0, opIdx);
		String op = left.substring(opIdx, opIdx + 1);
		String strB = left.substring(opIdx + 1);

		if (strA.equals("?")) {
			long b = Long.parseLong(strB);
			long c = Long.parseLong(strC);
			if (op.equals("+")) {
				System.out.println(c - b);
			} else if (op.equals("-")) {
				System.out.println(c + b);
			} else if (op.equals("*")) {
				System.out.println(c / b);
			} else if (op.equals("/")) {
				System.out.println(c * b);
			}
		} else if (strB.equals("?")) {
			long a = Long.parseLong(strA);
			long c = Long.parseLong(strC);
			if (op.equals("+")) {
				System.out.println(c - a);
			} else if (op.equals("-")) {
				System.out.println(a - c);
			} else if (op.equals("*")) {
				System.out.println(c / a);
			} else if (op.equals("/")) {
				System.out.println(a / c);
			}
		} else if (strC.equals("?")) {
			long a = Long.parseLong(strA);
			long b = Long.parseLong(strB);
			if (op.equals("+")) {
				System.out.println(a + b);
			} else if (op.equals("-")) {
				System.out.println(a - b);
			} else if (op.equals("*")) {
				System.out.println(a * b);
			} else if (op.equals("/")) {
				System.out.println(a / b);
			}
		} else {
			long a = Long.parseLong(strA);
			long b = Long.parseLong(strB);
			long c = Long.parseLong(strC);
			if (a + b == c) {
				System.out.println("+");
			} else if (a - b == c) {
				System.out.println("-");
			} else if (a * b == c) {
				System.out.println("*");
			} else if (b != 0 && a / b == c) {
				System.out.println("/");
			}
		}

		reader.close();
	}

}
