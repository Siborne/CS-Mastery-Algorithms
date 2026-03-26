package week1.day4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int N;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			N = (int) st.nval;
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			Arrays.sort(arr);
			int diff = 0;
			for (int i = 0; i < N - 1; i++) {
				diff = gcd(diff, arr[i + 1] - arr[i]);
			}
			if (diff == 0) {
				writer.println(N);
			} else {
				int max = arr[N - 1];
				int min = arr[0];
				writer.println((max - min) / diff + 1);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}
