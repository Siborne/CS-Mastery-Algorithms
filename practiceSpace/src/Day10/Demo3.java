package Day10;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Demo3 {
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(reader.readLine());
		int[] a = new int[n];
		
		for(int i = 0;i<n;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(reader.readLine());
		int m = Integer.parseInt(st.nextToken());
		int[] diff = new int[n];
		while(m-->0) {
			st = new StringTokenizer(reader.readLine());
			int l = Integer.parseInt(st.nextToken())-1;
			int r = Integer.parseInt(st.nextToken());
			diff[l]++;
			if(r<n) {
				diff[r]--;
			}
		}
		for(int i = 1;i<n;i++) {
			diff[i]+=diff[i-1];
		}
		long sum = 0;
		long res = 0;
		for(int i = 0;i<n;i++) {
			sum+=(long)a[i]*diff[i];
		}
		Arrays.sort(a);
		Arrays.sort(diff);
		for(int i = 0;i<n;i++) {
			res += (long)a[i]*diff[i];
		}
		writer.println(res-sum);
		writer.flush();
		writer.close();
		reader.close();
	}

}
