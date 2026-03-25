package Day60;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(reader.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());

		st = new StringTokenizer(reader.readLine());
		long now = 1;
		long ans = 0;
		for (int i = 0; i < m; i++) {
			long x = Long.parseLong(st.nextToken());
			if (x == now) {
				continue;
			}
			if (x > now) {
				ans += (x - now);
				now = x;
			} else {
				ans += (n - now + x);
				now = x;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
