package g2025;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < n - i - 1; j++) {
				if(arr[j+1]>arr[j]) {
					swap(arr, j, j+1);
					flag = true;
					cnt++;
				}
			}
			if (!flag) {
				break;
			}
		}
		System.out.println(cnt);
		reader.close();
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
