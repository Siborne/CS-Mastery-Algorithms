package Day30;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = { 2, 4, 8, 16 };
		int[] max = { 31, 16, 11, 8 };
		reader.nextLine();
		while (n-- > 0) {
			String[] st = reader.nextLine().split("\\s+");
			long b = Long.parseLong(st[1]);
			long c = 0;
			long r = 0;
			for (int i = 0; i < 4; i++) {
				if (st[0].length() <= max[i] && (test(st[0], arr[i]) || i == 3)) {
					long a = Long.parseLong(st[0],arr[i]);
					if(a<=b) {
						r=a;
						c++;
					}
				}
			}
			System.out.println(c != 1 ? -1 : r);
		}

	}

	private static boolean test(String s, int n) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c - '0' >= n) {
				return false;
			}
		}
		return true;
	}

}
