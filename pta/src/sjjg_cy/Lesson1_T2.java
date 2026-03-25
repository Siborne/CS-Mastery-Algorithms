package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Lesson1_T2 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int K, left, ansLeft, ansRight;
	private static long ans, sum;
	private static int[] arr;
	private static boolean allNegative;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			K = (int) st.nval;
			ans = -1;
			sum = 0;
			left = 0;
			arr = new int[K];
			allNegative = true;
			for (int i = 0; i < K; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
				if (arr[i] >= 0) {
					allNegative = false;
				}
			}

			if (allNegative) {
				writer.println("0 " + arr[0] + " " + arr[K - 1]);
			} else {
				for (int i = 0; i < K; i++) {
					sum += arr[i];
					if (sum > ans) {
						ans = sum;
						ansLeft = left;
						ansRight = i;
					}
					if (sum < 0) {
						sum = 0;
						left = i + 1;
					}

				}
				writer.println(ans + " " + arr[ansLeft] + " " + arr[ansRight]);
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
