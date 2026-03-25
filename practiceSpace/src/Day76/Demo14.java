package Day76;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();

		while (t-- > 0) {
			int n = reader.nextInt();
			int x = reader.nextInt();
			int[] arr = new int[n + 2];
			arr[0] = 0;
			for (int i = 1; i <= n; i++) {
				arr[i] = reader.nextInt();
			}
			arr[n + 1] = x;
			
			int max = 0;
			for(int i = 1;i<=n;i++) {
				max = Math.max(max, arr[i]-arr[i-1]);
			}
			max = Math.max(max, 2*(arr[n+1]-arr[n]));
			
			System.out.println(max);
		}

		reader.close();
	}

}
