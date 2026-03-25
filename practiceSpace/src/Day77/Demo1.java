package Day77;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			reader.nextLine();
			int[] ans = new int[n];
			for (int i = 0; i < n; i++) {
				char[] chs = reader.nextLine().toCharArray();
				for (int j = 0; j < chs.length; j++) {
					if (chs[j] == '#') {
						ans[i] = j + 1;
					}
				}
			}
			for (int i = ans.length - 1; i >= 0; i--) {
				System.out.print(ans[i] + " ");
			}
			System.out.println();
		}

		reader.close();
	}

}
