package Day61;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int[] w = new int[4];
		for(int i = 1;i<=3;i++) {
			w[i] = reader.nextInt();
		}
//		Arrays.sort(w);
		
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		
		for(int i = 1;i<=3;i++) {
			for(int j = w[i];j<=n;j++) {
				if(dp[j-w[i]]!=-1) {
					dp[j] =Math.max(dp[j], dp[j-w[i]]+1); 
				}
			}
		}
		System.out.println(dp[n]);
		reader.close();
	}
	
}
