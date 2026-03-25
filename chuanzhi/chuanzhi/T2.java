package chuanzhi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class T2 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner reader = new Scanner(System.in);
		int t = Integer.parseInt(reader.readLine());
		while(t-->0) {
			int m = Integer.parseInt(reader.readLine());
			long ans = 0;
			
			long[] arr = new long[m];
			StringTokenizer st = new StringTokenizer(reader.readLine());
			for(int i = 0;i<m;i++) {
				arr[i] = Long.parseLong(st.nextToken());
			}
			
			Arrays.sort(arr);
			
			int i = 0;
			while(i<arr.length) {

				ans = Math.max(ans, arr[i]*(arr.length-i));
				long j = arr[i];
				for(int k = i;k<m;k++) {
					arr[k]-=j;
				}
				
				while(i<m&&arr[i]==0) {
					i++;
				}
				
			}
			
			writer.println(ans);
			
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}

}
