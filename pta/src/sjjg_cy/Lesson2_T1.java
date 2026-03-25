package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Lesson2_T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final int OFFSET = 1000;
	private static final int MAXN = 2001;

	public static void main(String[] args) throws IOException {
		int[] polyA = readPoly();
		int[] polyB = readPoly();

		int[] product = multiply(polyA, polyB);
		int[] sum = add(polyA, polyB);

		printPoly(product);
		printPoly(sum);

		writer.flush();
		writer.close();
		reader.close();
	}

	private static int[] readPoly() throws IOException {
		st.nextToken();
		int n = (int) st.nval;
		int[] poly = new int[MAXN];

		for (int i = 0; i < n; i++) {
			st.nextToken();
			int coef = (int) st.nval;
			st.nextToken();
			int exp = (int) st.nval + OFFSET;
			poly[exp] += coef;
		}

		return poly;
	}

	private static int[] add(int[] A, int[] B) {
		int[] res = new int[MAXN];
		for (int i = 0; i < MAXN; i++) {
			res[i] = A[i] + B[i];
		}
		return res;
	}

	private static int[] multiply(int[] A, int[] B) {
		int[] res = new int[MAXN * 2 + 1];
		for (int i = 0; i < MAXN; i++) {
			if (A[i] != 0) {
				for (int j = 0; j < MAXN; j++) {
					if (B[j] != 0) {
						int exp = i + j;
						res[exp] += A[i] * B[j];
					}
				}
			}
		}
		return res;
	}

	private static void printPoly(int[] poly) {
		boolean first = true;
		boolean hasOutput = false;

		int maxIndex = (poly.length > MAXN) ? 4000 : 2000;
		for (int exp = maxIndex; exp >= 0; exp--) {
			int coef = poly[exp];
			if (coef == 0) {
				continue;
			}

			int originalExp;
			if (poly.length > MAXN) {
				originalExp = exp - OFFSET * 2;
			} else {
				originalExp = exp - OFFSET;
			}
			if (Math.abs(originalExp) > 1000 && poly.length <= MAXN) {
				continue;
			}
			if (!first) {
				writer.print(" ");
			}
			writer.print(coef + " " + originalExp);
			first = false;
			hasOutput = true;
		}
		if (!hasOutput) {
			writer.print("0 0");
		}
		writer.println();
	}

}
