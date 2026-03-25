package Day45;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo12 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);
		int n = Integer.parseInt(reader.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] brr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			brr[i] += brr[i - 1] + arr[i - 1];
		}
		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			st = new StringTokenizer(reader.readLine());
			int l = Integer.parseInt(st.nextToken()) - 1;
			int r = Integer.parseInt(st.nextToken());
			int ans = brr[r] - brr[l];
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
