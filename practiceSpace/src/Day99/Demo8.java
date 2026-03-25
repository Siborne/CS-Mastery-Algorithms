package Day99;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] arr = new int[n];
		boolean[] o = new boolean[n];
		int[] brr = new int[m];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
			o[i] = true;
		}
		for (int i = 0; i < m; i++) {
			brr[i] = reader.nextInt();
		}
		int index1 = 0;
		int index2 = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		for (int i = 0; i < n; i++) {
			if (index1 < m && arr[i] == brr[index1]) {
				o[i] = false;
				cnt1++;
				index1++;
			}
		}

		for (int i = 0; i < n; i++) {
			if (index2 < m && arr[i] == brr[index2] && o[i]) {
				cnt2++;
				index2++;
			}
		}
		if (cnt1 == m && cnt2 == m) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		reader.close();
	}

}
