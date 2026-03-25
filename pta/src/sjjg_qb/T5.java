package sjjg_qb;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int K;
	private static int[] order, cards, suits;

	public static void main(String[] args) throws IOException {
		st.nextToken();
		K = (int) st.nval;

		order = new int[54];
		for (int i = 0; i < 54; i++) {
			st.nextToken();
			order[i] = (int) st.nval;
		}

		String[] cards = new String[54];
		String[] suits = new String[] { "S", "H", "C", "D", "J" };
		int index = 0;
		for (String suit : suits) {
			int max = (suit.equals("J")) ? 2 : 13;
			for (int j = 1; j <= max; j++) {
				cards[index++] = suit + j;
			}
		}

		for (int k = 0; k < K; k++) {
			String[] next = new String[54];
			for (int i = 0; i < 54; i++) {
				next[order[i] - 1] = cards[i];
			}
			cards = next;
		}
		for (int i = 0; i < 54; i++) {
			if (i > 0) {
				System.out.print(" ");
			}
			System.out.print(cards[i]);
		}
		System.out.println();
		writer.flush();
		writer.close();
		reader.close();
	}

}
