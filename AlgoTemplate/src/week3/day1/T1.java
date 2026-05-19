package week3.day1;

import java.util.Iterator;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		String line = reader.nextLine();

//		int[] arr = new int[n];
		boolean flag = false;
		int l = 0;
		for (int i = 0; i < n; i++) {
			char c = line.charAt(i);
			if (c == '(') {
				l++;
			} else {
				if (l > 0) {
					l--;
				} else {
					flag = true;
					break;
				}
			}
		}

		System.out.println(!flag && l == 0 ? "Yes" : "No");

		reader.close();
	}

}
