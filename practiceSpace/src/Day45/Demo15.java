package Day45;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.PrintWriter;

public class Demo15 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		int[] arr = new int[n];
		int[] pre = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
			pre[i + 1] = (pre[i] + arr[i]) % 7;
		}

		int[] first = new int[7];
		int[] last = new int[7];
		Arrays.fill(first, -1);
		first[0] = 0;
		
		for(int i = 1;i<=n;i++) {
			if(first[pre[i]]==-1) {
				first[pre[i]] = i;
			}
			last[pre[i]] = i;
		}
		
		int maxLen = 0;
		for(int i = 0;i<7;i++) {
			if(first[i]!=-1) {
				maxLen = Math.max(maxLen, last[i]-first[i]);
			}
		}
		
		
		writer.println(maxLen);
		writer.flush();
		writer.close();
		reader.close();
	}

}
