package Day86;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			int temp = Integer.MAX_VALUE;
			for (int j = i; j < n; j++) {
				temp = Math.min(temp, arr[j]);
				ans += temp;
			}
			
		}
		System.out.println(ans);
		reader.close();
	}

}
