package Day130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			List<int[]> list = new ArrayList<>();

			for (int i = 1; i <= n; i++) {
				int[] arr = new int[4];
				st.nextToken();
				arr[0] = (int) st.nval;
				st.nextToken();
				arr[1] = (int) st.nval;
				arr[2] = arr[0] * arr[1];
				arr[3] = i;
				list.add(arr);
			}
			
			Collections.sort(list,(o1,o2)->{
				if (o1[2]!=o2[2]) {
					return Integer.compare(o2[2], o1[2]);
				}else if (o1[0]!=o2[0]) {
					return Integer.compare(o2[0], o1[0]);
				}
				return Integer.compare(o1[3],o2[3]);
			});
			
			StringBuilder sb = new StringBuilder();
			for (int[] is : list) {
				sb.append(is[3]).append(" ");
			}
			writer.println(sb.toString());
			

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
