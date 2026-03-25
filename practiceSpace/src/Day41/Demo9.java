package Day41;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] arr = reader.nextLine().toCharArray();
		int len = arr.length;
		char[] brr = new char[len];
		for(int i = 0;i<len;i++) {
			brr[i] = arr[len-1-i];
		}
		int[][] dp = new int[len+1][len+1];
		for(int i = 1;i<=len;i++){
			for(int j = 1;j<=len;j++) {
				if(arr[i-1]==brr[j-1]) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		System.out.println(len-dp[len][len]);
//		System.out.println(dp[len][len]);
		reader.close();
	}

}
