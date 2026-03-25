package Day76;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();
		int q = reader.nextInt();
		int[] f = new int[s.length() + 1];
		for (int i = 0; i < s.length() - 1; i++) {
			boolean flag = s.charAt(i) == s.charAt(i + 1);
			f[i + 1] = f[i] + (flag ? 1 : 0);
		}
		while (q-- > 0) {
			int l = reader.nextInt();
			int r = reader.nextInt();
			System.out.println(f[r - 1] - f[l - 1]);
		}

		reader.close();
	}

}
