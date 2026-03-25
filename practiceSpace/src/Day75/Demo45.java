package Day75;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo45 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);

		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			st = new StringTokenizer(reader.readLine());

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int ans = Integer.MIN_VALUE;

			for (int i = 0; i < k; i++) {
				int count = 0;
				for (int j = 0; j < n; j++) {
					boolean flag = true;
					for (int l = 0; l < k; l++) {
						if (j + l >= n || arr[j + l] == 1) {
							flag = false;
							break;
						}
					}

					if (flag) {
						j += k;
						count++;
					}

				}
				if (ans < count) {
					ans = count;
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
