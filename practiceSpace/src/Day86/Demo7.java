package Day86;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int q = reader.nextInt();
			long[] arr = new long[n + 1];
			long[] sum = new long[n + 2];
			for (int i = 1; i <= n; i++) {
				arr[i] = reader.nextLong();
				sum[i] = sum[i - 1] + arr[i];
			}
			while (q-- > 0) {
				int l = reader.nextInt();
				int r = reader.nextInt();
				int k = reader.nextInt();
				long tempSum = (r - l + 1) * k;
				long ans = (sum[n] - (sum[r] - sum[l - 1])) + tempSum;
				if((ans&1)==1) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}

		reader.close();
	}

}
