package Day103;

import java.util.Arrays;
import java.util.Scanner;

public class Demo22 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] x = new int[2 * n];
		for (int i = 0; i < x.length; i++) {
			x[i] = reader.nextInt();
		}
		Arrays.sort(x);

		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0, j = 0; i < 2 * n; i += 2, j++) {
			if (x[i] != x[i + 1]) {
				System.out.println("-1");
				return;
			}
			a[j] = x[i];
			b[j] = x[i + 1];
		}
		for (int i = 0; i < a.length; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(a[i]);
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(b[i]);
		}
		reader.close();
	}

}
