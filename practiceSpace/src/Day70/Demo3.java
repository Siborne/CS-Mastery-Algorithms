package Day70;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int k = reader.nextInt();
			int[] arr = new int[n];
			int[] brr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = reader.nextInt();
			}
			for (int i = 0; i < n; i++) {
				brr[i] = reader.nextInt();
			}
			Arrays.sort(arr);
			Arrays.sort(brr);
			int ans = 0;
			int i = n-1;
			int j = n-1;
			int m = n;
			while(k>0&&m>0) {
				if(brr[j]>arr[i]) {
					ans+=brr[j];
					k--;
					j--;
					m--;
				}else {
					ans+=arr[i];
					i--;
					m--;
				}
			}
			while(m>0) {
				ans+=arr[i];
				i--;
				m--;
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
