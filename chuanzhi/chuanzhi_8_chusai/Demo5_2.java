package chuanzhi_8_chusai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Demo5_2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n;

	public static void main(String[] args) throws IOException {
		st.nextToken();
		n = (int) st.nval;
		TreeSet<Integer> set = new TreeSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			st.nextToken();
			int a = (int) st.nval;
			st.nextToken();
			int b = (int) st.nval;
			set.add(a);
			map.put(a, Math.max(map.getOrDefault(a, b), b));
		}

		List<Integer> list = new ArrayList<>(set);
		int tempMax = 0;
		for (Integer integer : list) {
			tempMax = Math.max(tempMax, map.get(integer));
			map.put(integer, tempMax);
		}

		st.nextToken();
		int q = (int) st.nval;
		while (q-- > 0) {
			st.nextToken();
			int x = (int) st.nval;
			int left = 0;
			int right = list.size() - 1;
			int ans = -1;
			while (left <= right) {
				int mid = (right - left) / 2 + left;
				int midNum = list.get(mid);
				if (midNum > x) {
					right = mid - 1;
				} else {
					ans = map.get(midNum);
					left = mid + 1;
				}
			}
			writer.println(ans);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
