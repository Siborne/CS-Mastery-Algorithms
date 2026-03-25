package Day103;

import java.util.Scanner;

public class Demo19 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();
		reader.nextLine();
		String s = reader.nextLine();
		int[] diff = new int[n - 1];
		for (int i = 0; i < diff.length; i++) {
			diff[i] = Math.abs(s.charAt(i) - s.charAt(i + 1));
		}
		long ans = 0;
		for (int l = 0, r = 0, sum = 0; r < diff.length; r++) {
			sum += diff[r];
			if (r - l + 1 > k - 1) {
				sum -= diff[l++];
			}
			if (r - l + 1 == k - 1) {
				ans += sum;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
