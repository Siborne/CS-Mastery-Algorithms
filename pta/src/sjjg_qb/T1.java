package sjjg_qb;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		String s = reader.next();
		int level = 0;
		int sum = 0;
		while (true) {
			level++;
			int levelSum = level * 2 - 1;
			if (level == 1) {
				if (levelSum > n) {
					level = 0;
					break;
				}
				sum = levelSum;
			} else {
				if (sum + levelSum * 2 <= n) {
					sum += levelSum * 2;
				} else {
					level--;
					break;
				}
			}
		}

		for (int i = level; i >= 1; i--) {
			StringBuilder sb = new StringBuilder();
			for (int j = i; j < level; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				sb.append(s);
			}
			System.out.println(sb.toString());
		}

		for (int i = 2; i <= level; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = i; j < level; j++) {
				sb.append(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				sb.append(s);
			}
			System.out.println(sb.toString());
		}

		System.out.println(n - sum);
		reader.close();
	}

}
