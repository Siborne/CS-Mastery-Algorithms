package Day130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo8 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			int[] arr = new int[n];
			int[] brr = new int[m];

			for (int i = 0; i < arr.length; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			reverseArray(arr);

			for (int i = 0; i < brr.length; i++) {
				st.nextToken();
				brr[i] = (int) st.nval;
			}
			reverseArray(brr);

			List<Integer> result = new ArrayList<>();
			int carry = 0;
			int len = Math.max(n, m);
			int i = 0;
			while (i < len || carry > 0) {
				int digitA = (i < n) ? arr[i] : 0;
				int digitB = (i < m) ? brr[i] : 0;
				int base = i + 2;
				int sum = digitA + digitB + carry;
				result.add(sum % base);
				carry = sum / base;
				i++;
			}
			Collections.reverse(result);
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < result.size(); j++) {
				if (j > 0) {
					sb.append(" ");
				}
				sb.append(result.get(j));
			}
			writer.println(sb.toString());

		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void reverseArray(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			int tmp = arr[l];
			arr[l++] = arr[r];
			arr[r--] = tmp;
		}
	}

}
