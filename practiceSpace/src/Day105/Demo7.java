package Day105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo7 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	private static List<int[]> list;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
		list = new ArrayList<>();
	}

	private static int n;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			for (int i = 0; i < n; i++) {
				int[] arr = new int[3];
				for (int j = 0; j < 3; j++) {
					st.nextToken();
					arr[j] = (int) st.nval;
				}
				list.add(arr);
			}
			Collections.sort(list, (o1, o2) -> {
				if (o1[0] != o2[0]) {
					return Integer.compare(o1[0], o2[0]);
				}
				if (o1[1] != o2[1]) {
					return Integer.compare(o1[1], o2[1]);
				}
				if (o1[2] != o2[2]) {
					return Integer.compare(o1[2], o2[2]);
				}
				return 0;
			});
			for (int i = 0; i < n; i++) {
				int[] arr = list.get(i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < arr.length; j++) {
					if (j > 0) {
						sb.append(" ");
					}
					sb.append(arr[j]);
				}
				writer.println(sb.toString());
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
