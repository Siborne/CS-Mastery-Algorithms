package Day148;

import java.util.Scanner;

public class Demo2Help {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String line = reader.next();
		char[] chs = line.toCharArray();
		int left = 0;
		int right = 0;
		int len = chs.length;
		for (char c : chs) {
			if (c == '(') {
				left++;
			} else if (c == ')') {
				right++;
			}
		}
		System.out.println("len:" + len);
		System.out.println("('nums:" + left);
		System.out.println(")'nums:" + right);
		reader.close();
	}

}
