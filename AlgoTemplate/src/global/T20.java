package global;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class T20 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int n;
	private static List<List<Integer>> ans = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			ans.clear();
			dfs(1, new ArrayList<>());
			for (List<Integer> list : ans) {
				if (list == null || list.isEmpty()) {
					writer.println();
					continue;
				}
				StringBuilder sb = new StringBuilder();
				for (int i : list) {
					sb.append(i).append(" ");
				}
				writer.println(sb.toString().trim());
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void dfs(int num, List<Integer> list) {
		if (num > n) {
			ans.add(new ArrayList<>(list));
			return;
		}
		dfs(num + 1, list);
		list.add(num);
		dfs(num + 1, list);
		list.remove(list.size() - 1);
	}

}
