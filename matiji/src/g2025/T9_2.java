package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class T9_2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		st.nextToken();
		int n = (int) st.nval;
		st.nextToken();
		int m = (int) st.nval;
		int[] arr = new int[n];
		int[] brr = new int[n + 2];

		for (int i = 0; i < n; i++) {
			st.nextToken();
			arr[i] = (int) st.nval;
		}

		for (int i = 0; i < m; i++) {
			st.nextToken();
			int l = (int) st.nval;
			st.nextToken();
			int r = (int) st.nval;
			st.nextToken();
			int x = (int) st.nval;
			for (int j = l - 1; j < r; j++) {
				arr[j] = x;
			}
//			brr[l] = x;
//			brr[r + 1] = -x;
		}

//		for (int i = 2; i <= n + 1; i++) {
//			brr[i] += brr[i - 1];
//		}
//
//		for (int i = 0; i < n; i++) {
//			if (brr[i + 1] > 0)
//				arr[i] = brr[i + 1];
//		}
		for (int a : arr) {
			writer.print(a + " ");
		}

		writer.flush();
		writer.close();
		reader.close();
	}
}
