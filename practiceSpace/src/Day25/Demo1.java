package Day25;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

//注意类名必须为 Main, 不要有任何 package xxx 信息
public class Demo1 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out)); 
	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);
		// 注意 hasNext 和 hasNextLine 的区别
		int n = Integer.parseInt(reader.readLine());
		StringTokenizer st = new StringTokenizer(reader.readLine());
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}

		int ans = 0;

		for (int i = 1; i < n - 1; i++) {
			if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
				ans++;
			}
		}
		writer.println(ans);
		writer.flush();
		writer.close();
		reader.close();
	}
}