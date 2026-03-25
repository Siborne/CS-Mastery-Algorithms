package Day106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Demo4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int[] arr;
	private static int T, n;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			T = (int) st.nval;
			while (T-- > 0) {
				st.nextToken();
				n = (int) st.nval;
				arr = new int[n];
				for (int i = 0; i < n; i++) {
					st.nextToken();
					arr[i] = (int) st.nval;
				}
				Arrays.sort(arr);
//				for (int i = 0; i < arr.length / 2; i++) {
//					int temp = arr[i];
//					arr[i] = arr[arr.length - 1 - i];
//					arr[arr.length - 1 - i] = temp;
//				}
				int ans = 0;
				for (int i = n - 1; i >= 0; i--) {
					if (arr[i] > ans) {
						ans++;
					} else {
						break;
					}
				}
				writer.println(ans);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
