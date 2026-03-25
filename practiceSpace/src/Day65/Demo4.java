package Day65;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();

		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		
		int[] brr = new int[n+1];
		brr[n-1] = arr[n-1];
		for(int i = n-2;i>=0;i--) {
			brr[i] = brr[i+1]+arr[i];
		}
		int ans = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<=n-k;i++) {
			if(brr[i]-brr[i+k]<min) {
				ans = i;
				min = brr[i]-brr[i+k];
			}
		}
		System.out.println(ans+1);
		reader.close();
	}

}
