package Day12;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int[] dp = new int[(int)1e5+1];
		Arrays.fill(dp, (int)1e9);
		dp[0] = 0;
		int[] arr = {20,10,5,4,1};
		for(int i = 0;i<dp.length;i++) {
			for(int a:arr) {
				if(i>=a) {
					dp[i] = Math.min(dp[i-a]+1, dp[i]);
				}
			}
		}
		
		while(reader.hasNext()) {
			int n = reader.nextInt();
			System.out.println(dp[n]);
		}
		
	}

}
