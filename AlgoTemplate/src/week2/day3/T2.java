package week2.day3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final int MAXN = (int) 1e6 + 5;
//	private static int[] arr = new int[MAXN];
	private static int[] brr = new int[MAXN];

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			int minIndex = Integer.MAX_VALUE;
			int maxIndex = Integer.MIN_VALUE;
			while (n-- > 0) {
				st.nextToken();
				int l = (int) st.nval;
				st.nextToken();
				int r = (int) st.nval;
				brr[l]++;
				brr[r + 1]--;
				minIndex = Math.min(minIndex, l);
				maxIndex = Math.max(maxIndex, r);
			}
			int max = Integer.MIN_VALUE;
			for (int i = minIndex; i <= maxIndex; i++) {
				max = Math.max(max, brr[i]);
				brr[i + 1] += brr[i];
			}
			writer.println(max);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
