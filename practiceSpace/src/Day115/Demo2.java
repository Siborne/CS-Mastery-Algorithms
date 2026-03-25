package Day115;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] a = new int[1010];

		for (int i = 1; i <= 1000; i++) {
			a[i] = 1;
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= (i >> 1); j++) {
				a[i]+=a[j];
			}
		}
		
		System.out.println(a[n]);
		reader.close();
	}

}
