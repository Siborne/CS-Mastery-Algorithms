package Day127;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[] f = new int[31];
		f[0] = 3;
		for (int i = 1; i < f.length; i++) {
			f[i] = (f[i - 1] - 1) * 2;
		}

		int n = reader.nextInt();
		while (n-- > 0) {
			int x = reader.nextInt();
			System.out.println(f[x]);
		}

		reader.close();
	}

}
