package codeforces_round_1038;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class T2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	
	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);

		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(reader.readLine());
			long base = 0l;
			long extra = 0l;
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				base += Math.abs(a - c) + Math.abs(b - d);
				if (b > d) {
					if (c < a) {
						extra += c;
					} else {
						extra += a;
					}

				}
			}

			long ans = (base / 2) + extra;
			writer.println(ans);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
