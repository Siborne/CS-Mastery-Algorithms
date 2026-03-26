package week1.day4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Iterator;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	private static int gcd(int a, int b) {
		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			long ans = 0;
			for (int i = 1; i <= n; i++) {
				int now = arr[i - 1];
				int g = gcd(i, now);
				int k = now / g;
				ans += n / k;
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
