package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Lesson9_T3 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new BufferedOutputStream(System.out));
	}

	private static int N;
	private static int[] original, partial;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			N = (int) st.nval;
			original = new int[N];
			partial = new int[N];

			for (int i = 0; i < N; i++) {
				st.nextToken();
				original[i] = (int) st.nval;
			}
			for (int i = 0; i < N; i++) {
				st.nextToken();
				partial[i] = (int) st.nval;
			}

			int k = 1;
			while (k < N && partial[k] >= partial[k - 1]) {
				k++;
			}
			boolean isInsertion = true;
			for (int i = k; i < N; i++) {
				if (partial[i] != original[i]) {
					isInsertion = false;
					break;
				}
			}
			if (isInsertion) {
				writer.println("Insertion Sort");
				int temp = partial[k];
				int j = k;
				while (j > 0 && partial[j - 1] > temp) {
					partial[j] = partial[j - 1];
					j--;
				}
				partial[j] = temp;
			} else {
				writer.println("Heap Sort");
				int[] sorted = partial.clone();
				Arrays.sort(sorted);
				int i = N - 1;
				int j = N - 1;
				while (i >= 0 && j >= 0 && partial[i] == sorted[j]) {
					i--;
					j--;
				}
				swap(partial, 0, i);
				downAdjust(partial, 0, i);
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < N; i++) {
				if (i > 0) {
					sb.append(" ");
				}
				sb.append(partial[i]);
			}
			writer.println(sb.toString());
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void downAdjust(int[] arr, int parent, int len) {
		int temp = arr[parent];
		int child = 2 * parent + 1;
		while (child < len) {
			if (child + 1 < len && arr[child + 1] > arr[child]) {
				child++;
			}
			if (temp >= arr[child]) {
				break;
			}
			arr[parent] = arr[child];
			parent = child;
			child = 2 * parent + 1;
		}
		arr[parent] = temp;
	}

}
