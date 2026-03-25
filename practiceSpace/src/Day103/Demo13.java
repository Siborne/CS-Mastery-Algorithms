package Day103;

import java.util.Arrays;
import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int x = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		int ans = 0;
		int i;
		for (i = 0; i < n; i++) {
			if (x < arr[i]) {
				break;
			}
			ans++;
		}
		x-=arr[i-1];
		System.out.println(ans + " " + x);
		reader.close();
	}

}
