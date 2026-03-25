package Day55;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		int[] brr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
			brr[i] = reader.nextInt();
		}
		int ans = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				if(arr[i]==brr[j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
