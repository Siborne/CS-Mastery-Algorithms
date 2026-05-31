package global;

import java.util.Arrays;
import java.util.Scanner;

public class T8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] p = new int[m];
		for (int i = 0; i < p.length; i++) {
			p[i] = reader.nextInt();
		}
		Arrays.sort(p);
		int[] arr = new int[n + 1];
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < arr.length; i++) {
			arr[i] = Math.max(Math.abs(i - p[0]), Math.abs(i - p[m - 1]));
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb.toString());

		reader.close();
	}

}
