package Day70;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int[] s = new int[4];
			for (int i = 0; i < 4; i++) {
				s[i] = reader.nextInt();
			}
			int a1 = Math.max(s[0], s[1]);
			int a2 = Math.max(s[2], s[3]);
			Arrays.sort(s);
			if ((s[3] == a1 && s[2] == a2) || (s[3] == a2 && s[2] == a1)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
