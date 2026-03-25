package Day43;

import java.util.Arrays;
import java.util.Scanner;

public class Demo8 {

	private static int n;
	private static int m;
	private static int[] l;
	private static double[] p;
	private static double[][] dp;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		m = reader.nextInt();
		l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = reader.nextInt();
		}
		p = new double[m];
		for (int i = 0; i < m; i++) {
			p[i] = reader.nextDouble();
		}
		dp = new double[m][1<<n];
		for(int i = 0;i<m;i++) {
			Arrays.fill(dp[i], -1);
		}
		
		double ans = cal(0,(1<<n)-1);
		System.out.printf("%.2f",ans);
		reader.close();
	}
	
	private static double cal(int i,int j) {
		if(i>=m) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		double minExpected = Double.MAX_VALUE;
		for(int t = 0;t<n;t++) {
			if((j&(1<<t))!=0) {
				minExpected = Math.min(minExpected, cal(i+l[t],j&~(1<<t)));
			}
		}
		minExpected = Math.min(minExpected, cal(i+1,j)+p[i]);
		dp[i][j] = minExpected;
		return minExpected;
	}

}
