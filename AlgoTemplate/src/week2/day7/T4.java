package week2.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n, target;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			target = (int) st.nval;
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			int slow = 0;
			int fast = 0;
			int ans = 0;
			int temp = 0;
			while (fast < n) {
				temp += arr[fast++];
				while (temp > target) {
					temp -= arr[slow++];
				}
				ans = Math.max(ans, fast - slow);
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
