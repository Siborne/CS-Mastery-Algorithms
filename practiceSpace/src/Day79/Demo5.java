package Day79;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream((System.out)));

	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);

		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			long k = Long.parseLong(st.nextToken());
			long[] arr = new long[n];

			st = new StringTokenizer(reader.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Long.parseLong(st.nextToken());
			}
			
			if(k==1e9) {
				writer.println(0);
				continue;
			}
		
			Arrays.sort(arr);
			
			
			long count = 1;
			long ans = 0;

			for (int i = 1; i < n; i++) {
				if (Math.abs(arr[i - 1] - arr[i]) > k) {
					ans = Math.max(ans, count);
					count = 1;
				} else {
					count++;
				}
			}
			ans = Math.max(count, ans);
			writer.println(n - ans);

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
