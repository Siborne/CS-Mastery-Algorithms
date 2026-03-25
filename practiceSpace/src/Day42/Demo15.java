package Day42;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();
		int t = reader.nextInt();
		int[] arr = new int[k];
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			arr[x % k]++;
		}

		int max = 0;
		int i = 0;
		int temp = 0;

		while (i <= t) {
			temp = temp + arr[i];
			if (temp > max) {
				max = temp;
			}
			i++;
		}

//		for(int j = t+1;j<arr.length;j++) {
//			temp = temp +arr[j]-arr[j-1-t];
//			if(temp>max) {
//				max = temp;
//			}
//		}
//		
//		for(int j = 0;j<=t;j++) {
//			temp = temp + arr[j]-arr[k+(j-t-1)];
//			if(temp>max) {
//				max = temp;
//			}
//		}

		for (int j = t + 1; j < arr.length + k; j++) {
			temp = temp + arr[j % k] - arr[(j - t - 1) % k];
			if (temp > max) {
				max = temp;
			}
		}

		System.out.println(max);
		reader.close();
	}

}
