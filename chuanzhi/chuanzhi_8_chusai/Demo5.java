package chuanzhi_8_chusai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n;

	public static void main(String[] args) throws IOException {
//		while (st.nextToken() != StreamTokenizer.TT_EOF) {
		st.nextToken();
		n = (int) st.nval;
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int[] arr = new int[2];
			st.nextToken();
			arr[0] = (int) st.nval;
			st.nextToken();
			arr[1] = (int) st.nval;
			list.add(arr);
		}

		Collections.sort(list, (o1, o2) -> {
			if (o1[0] == o2[0]) {
				return Integer.compare(o2[1], o1[1]);
			} else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
//			for (int[] is : list) {
//				writer.println("ÌÛÍ´:"+is[0]+" Ð§¹û:"+is[1]);
//			}
		st.nextToken();
		int q = (int) st.nval;
		while (q-- > 0) {
			st.nextToken();
			int x = (int) st.nval;
			int res = -1;
			for (int[] is : list) {
				if (x >= is[0]) {
					res = Math.max(res, is[1]);
				}
			}
			writer.println(res);

		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
