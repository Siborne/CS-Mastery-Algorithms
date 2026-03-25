package Day137;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int l = reader.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < h.length; i++) {
			h[i] = reader.nextInt();
		}
		Arrays.sort(h);
		for (int i : h) {
			if (l >= i) {
				l++;
			} else {
				break;
			}
		}
		System.out.println(l);

		reader.close();
	}

}
