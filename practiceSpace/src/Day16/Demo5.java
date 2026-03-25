package Day16;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo5 {
	private static BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] diff = new int[n+1];
		int[] ans = new int[n+1];
		int[] l = new int[n+1];
		int[] r = new int[n+1];
		
		for(int i = 1;i<=m;i++) {
			st = new StringTokenizer(reader.readLine());
			l[i] = Integer.parseInt(st.nextToken());
			r[i] = Integer.parseInt(st.nextToken());
			diff[l[i]]++;
			if(r[i]+1<=n) {
				diff[r[i]+1]--;
			}
		}
		reader.close();
		
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			diff[i] += diff[i-1];
			if(diff[i]==0) {
				sum++;
			}
			ans[i] = ans[i-1]+(diff[i] == 1?1:0);
		}
		
		for(int i = 1;i<=m;i++) {
			writer.println(ans[r[i]]-ans[l[i]-1]+sum);
		}
		
		
		writer.flush();
		writer.close();
	}
	
}
