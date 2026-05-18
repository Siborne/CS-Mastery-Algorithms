package chuanzhi_8_shengsai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			st = new StringTokenizer(reader.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			int min = arr[0];
			int max = arr[n - 1];
			long ans = 0;
			if (max < x) {
				ans = x - min;
				ans += (n - 1);
			} else if (min > x) {
				ans = max - x;
				ans += (n - 1);
			} else {
				int leftX = 0;
				int rightX = 0;
				int midX = 0;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] < x) {
						leftX++;
					} else if (arr[i] > x) {
						rightX++;
					} else {
						midX++;
					}
				}
				ans += midX - 1;
				ans += x - min + (leftX);
				ans += max - x + (rightX);
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
