package Day27;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		Integer[] arr = new Integer[n];
		Integer[] brr = new Integer[m];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		for (int i = 0; i < m; i++) {
			brr[i] = reader.nextInt();
		}

		Arrays.sort(arr, Collections.reverseOrder());
		Arrays.sort(brr, Collections.reverseOrder());

		int i = 0;
		int j = 0;
		long ans = 0;

		while (i < n && j < m) {
			if (arr[i] >= brr[j]) {
				ans += (long) arr[i] * (m - j);
				i++;
			} else {
				ans += (long) brr[j] * (n - i);
				j++;
			}
		}
		while (i < n) {
			ans += (long) arr[i] * (m - j);
			i++;
		}

		while(j<m) {
			ans+=(long)brr[j]*(n-i);
			j++;
		}
		
		System.out.println(ans);
	}

}
