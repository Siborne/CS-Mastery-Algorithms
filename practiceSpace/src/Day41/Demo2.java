package Day41;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<=i;j++) {
				arr[i][j] = reader.nextInt();
			}
		}
		int ans = 0;
		
		for(int i = 1;i<n;i++) {
			for(int j = 0;j<=i;j++) {
				int left = j>0?arr[i-1][j-1]:Integer.MIN_VALUE;
				int right = j<n?arr[i-1][j]:Integer.MIN_VALUE;
				arr[i][j] += Math.max(left,right);
			}
		}
		
		if((n&1)==1) {
			int mid = (n-1)>>1;
			ans = arr[n-1][mid];
		}else {
			int mid1 = n>>1;
			int mid2 = mid1-1;
			ans = Math.max(arr[n-1][mid1], arr[n-1][mid2]);
		}
		System.out.println(ans);
		reader.close();
	}

}
