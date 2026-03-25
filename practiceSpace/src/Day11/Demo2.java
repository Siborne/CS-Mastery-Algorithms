package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo2 {
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(reader.readLine());
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		SparseTable stable = new SparseTable(arr);
		while(m-->0) {
			st = new StringTokenizer(reader.readLine());
			int l = Integer.parseInt(st.nextToken())-1;
			int r = Integer.parseInt(st.nextToken())-1;
			writer.println(stable.query(l, r));
		}
		writer.flush();
		writer.close();
		reader.close();
	}
	
	public static class SparseTable{
		private int[][] maxx, minn;
		private int[] log;
		
		public SparseTable(int[] arr) {
			int n = arr.length;
			int maxLog = (int)(Math.log(n)/Math.log(2))+1;
			maxx = new int[n][maxLog];
			minn = new int[n][maxLog];
			log = new int[n+1];
			
			log[1] = 0;
			for(int i = 2;i<=n;i++) {
				log[i] = log[i/2]+1;
			}
			
			for(int i = 0;i<n;i++) {
				maxx[i][0]=arr[i];
				minn[i][0]=arr[i];
			}
			
			for(int j = 1;j<maxLog;j++) {
				for(int i = 0;i+(1<<j)<=n;i++) {
					maxx[i][j] = Math.max(maxx[i][j-1], maxx[i+(1<<(j-1))][j-1]);
					minn[i][j] = Math.min(minn[i][j-1], minn[i+(1<<(j-1))][j-1]);
				}
			}
		}
		
		public int query(int l,int r) {
			int len = r-l+1;
			int k = log[len];
			int maxVal = Math.max(maxx[l][k],maxx[r-(1<<k)+1][k]);
			int minVal = Math.min(minn[l][k],minn[r-(1<<k)+1][k]);
			return maxVal;
		}
	}
}
