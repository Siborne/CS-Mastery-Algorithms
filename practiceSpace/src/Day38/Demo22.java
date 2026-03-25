package Day38;

import java.util.Scanner;

public class Demo22 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = reader.nextInt();
		}

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			if (arr[i] != i) {
				int temp = arr[i];
				arr[i] = arr[temp];
				arr[temp] = temp;
				ans++;
				i = 1;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
