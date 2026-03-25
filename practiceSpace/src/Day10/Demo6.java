package Day10;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] data = new int[200];
		for (int i = 0; i < 200; i++) {
			data[i] = 4 * i + 6;
		}
		int x = reader.nextInt();
		int l = 0;
		int r = 199;
		while (l < r) {
			int mid = (l + r) >> 1;
			if (data[mid] >= x) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		System.out.println(l);
	}

}
