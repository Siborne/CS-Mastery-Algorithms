package aaa;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int s = reader.nextInt();
		int n = reader.nextInt();
		int m = reader.nextInt();

		boolean flag1 = s % 2 != 0;

		int big = Math.max(n, m);
		int small = Math.min(n, m);
		// s=n+m
		boolean flag2 = big % small != 0;
		boolean flag3 = (s / small) % 2 != 0;
		if (flag1 || flag2 || flag3) {
			System.out.println("NO");
			return;
		}

		// 12 2 10 16 12 4
		if (s % (big - small) == 0) {
			System.out.println("3");
			return;
		}
		System.out.println(s / 2 + 1);

		reader.close();
	}

}
