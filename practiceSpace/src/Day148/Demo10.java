package Day148;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		long g = 0;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
			g = gcd(arr[i], g);
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += arr[i] / g - 1;
		}
		System.out.println(ans);
		reader.close();
	}

	private static long gcd(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
