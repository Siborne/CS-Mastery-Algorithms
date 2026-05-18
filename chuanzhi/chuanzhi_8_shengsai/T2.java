package chuanzhi_8_shengsai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class T2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(reader.readLine());
		while (T-- > 0) {
			int n = Integer.parseInt(reader.readLine());
			StringTokenizer st = new StringTokenizer(reader.readLine());
			long[] arr = new long[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Long.parseLong(st.nextToken());
			}
			if (n == 2) {
				writer.println(arr[0] * arr[1]);
				continue;
			}
			Arrays.sort(arr);
//			writer.println("1:" + 0 + " add: " + arr[n - 1] + " * " + arr[1]);
			long ans = arr[n - 1] * arr[1];
//			int i = 0;
			for (int i = n - 2; i >= 2; i--) {
//				writer.println("2:" + ans + " add: " + arr[i + 1] + " * " + arr[i]);
				ans += arr[i + 1] * arr[i];
			}
//			writer.println("3:"+ans+" add: " + arr[2] + " * " + arr[0]);
			ans += arr[2] * arr[0];
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
