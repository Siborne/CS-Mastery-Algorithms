package Day69;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int min = Integer.MAX_VALUE;
			int[] arr = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = reader.nextInt();
				min = Math.min(min, arr[i]);
			}
			int ans = 0;
			for(int a:arr) {
				ans+=a-min;
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
