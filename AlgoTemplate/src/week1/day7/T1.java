package week1.day7;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;

			int[] leftSeats = new int[20];
			for (int i = 0; i < leftSeats.length; i++) {
				leftSeats[i] = 5;
			}

			boolean[] used = new boolean[101];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				int p = (int) st.nval;
				boolean allocated = false;

				for (int j = 0; j < 20; j++) {
					if (leftSeats[j] >= p) {
						int startSeat = j * 5 + (5 - leftSeats[j]) + 1;

						StringBuilder sb = new StringBuilder();
						for (int k = 0; k < p; k++) {
							int seat = startSeat + k;
							used[seat] = true;
							sb.append(seat).append(k == p - 1 ? "" : " ");
						}
						writer.println(sb.toString());
						leftSeats[j] -= p;
						allocated = true;
						break;
					}
				}

				if (!allocated) {
					int cnt = 0;
					StringBuilder sb = new StringBuilder();
					for (int seat = 1; seat < used.length && cnt < p; seat++) {
						if (!used[seat]) {
							used[seat] = true;
							leftSeats[(seat - 1) / 5]--;
							sb.append(seat).append(cnt == p - 1 ? "" : " ");
							cnt++;
						}
					}
					writer.println(sb.toString());
				}

			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
