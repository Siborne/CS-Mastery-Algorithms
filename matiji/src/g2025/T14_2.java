package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.PriorityQueue;

public class T14_2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int T, n, k, max, x, temp;
	private static long sum;
	private static boolean flag;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
//			while (st.nextToken() != StreamTokenizer.TT_EOF) {
		st.nextToken();
		T = (int) st.nval;
		while (T-- > 0) {

			st.nextToken();
			n = (int) st.nval;
			st.nextToken();
			k = (int) st.nval;
			arr = new int[n];

			sum = 0;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				x = (int) st.nval;
				arr[i] = x;
			}
			Arrays.sort(arr);
			for (int i = 0; i < k - 1; i++) {
				sum += arr[i];
			}

			if (sum > arr[k - 1]) {
				flag = true;
			}

			if (!flag) {
				for (int i = k; i < n - 1; i++) {
					sum = sum + arr[i] - arr[i - k];
					if (sum > arr[i + 1]) {
						flag = true;
						break;
					}
				}
			}

			if (flag) {
				writer.println("YES");
			} else {
				writer.println("NO");
			}
		}
//			}
		writer.flush();
		writer.close();
		reader.close();
	}

}
