package Day109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = 1 << 7 + 1;
	private static final List<int[]> list = new ArrayList<>();
	private static int n;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			n = 1 << n;
			list.clear();
			for (int i = 1; i <= n; i++) {
				int[] arr = new int[2];
				st.nextToken();
				arr[0] = (int) st.nval;
				arr[1] = i;
				list.add(arr);
			}
			List<int[]> firstList = list.subList(0, n >>> 1);
			List<int[]> endList = list.subList(n >>> 1, n);

			Collections.sort(firstList, (o1, o2) -> Integer.compare(o2[0], o1[0]));
			Collections.sort(endList, (o1, o2) -> Integer.compare(o2[0], o1[0]));

			int maxEnergyFirst = firstList.get(0)[0];
			int maxEnergyEnd = endList.get(0)[0];
			int resultCountryId;
			if (maxEnergyFirst > maxEnergyEnd) {
				resultCountryId = endList.get(0)[1];
			} else {
				resultCountryId = firstList.get(0)[1];
			}
			writer.println(resultCountryId);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
