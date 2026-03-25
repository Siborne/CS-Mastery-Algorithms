package Day47;

import java.util.Scanner;

public class Demo5 {

	private static int n, k;
	private static int[] a = new int[16];
	private static int[] s = new int[15];
	private static long ans = -1;
	private static long[][] f = new long[16][16];

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		k = reader.nextInt();
		for(int i = 1;i<=n;i++) {
			a[i] = reader.nextInt();
		}
		
		dfs(1,0,0);
		System.out.println(ans);
		reader.close();
	}
	
	private static void dfs(int x,int t1,int t2) {
		if(x==n) {
			dp();
			return;
		}
		if(t1<k) {
			s[x]=2;
			dfs(x+1,t1+1,t2);
		}
		if(t2<n-k-1) {
			s[x] = 1;
			dfs(x+1,t1,t2+1);
		}
	}
	
	private static void dp() {
		// TODO Auto-generated method stub
		for(int i = 0;i<=n;i++) {
			for(int j = 0;j<=n;j++) {
				f[i][j] = 0;
			}
		}
		
		for(int i = 1;i<=n;i++) {
			f[i][i] = a[i];
		}
		
		for(int len =2;len<=n;len++) {
			for(int i = 1;i+len-1<=n;i++) {
				int j= i + len -1;
				for(int k = i;k<j;k++) {
					long val;
					if(s[k]==1) {
						val = f[i][k] + f[k+1][j];
					}else {
						val = f[i][k] * f[k+1][j];
					}
					f[i][j] = Math.max(f[i][j], val);
				}
			}
		}
		ans = Math.max(ans, f[1][n]);
	}

}
