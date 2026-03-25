package Day106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int x = (int) st.nval;
			st.nextToken();
			int y = (int) st.nval;
			int[] arr = new int[n];
			int[] brr = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			for (int i = 0; i < n; i++) {
				st.nextToken();
				brr[i] = (int) st.nval;
			}
			Arrays.sort(arr);
			Arrays.sort(brr);
			for (int i = 0; i < x; i++) {
				if (arr[i] < y) {
					arr[i] = y;
				}
			}
			Arrays.sort(arr);
			int t = 0;
			for (int i = 0; i < n; i++) {
				if (brr[i]-arr[i]>t) {
					t = brr[i]-arr[i];
				}
			}
			writer.println(t);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
