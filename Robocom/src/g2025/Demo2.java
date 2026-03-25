package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int n, k, sum, ans, mid, count, p, temp, min, max,temp2;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
//		while (st.nextToken() != StreamTokenizer.TT_EOF) {
		st.nextToken();
		n = (int) st.nval;
		st.nextToken();
		k = (int) st.nval;
		arr = new int[n];
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			st.nextToken();
			arr[i] = (int) st.nval;
			sum += arr[i];
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		int l = sum / k;
		int r = sum;
		while (l <= r) {
			mid = l + ((r - l) >>> 1);
			if (mid < max) {
				l = mid + 1;
			}
			p = 0;
			temp = mid;
			temp2 = Integer.MAX_VALUE;
			count = 1;
			while (p < n) {
				if (temp >= arr[p]) {
					temp -= arr[p];
					p++;
				} else {
					count++;
					temp2 = Math.min(temp2, mid-temp);
					temp = mid;
				}
			}
			if (count <= k) {
				ans = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		writer.println(ans);
//		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
