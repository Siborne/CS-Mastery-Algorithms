package Day91;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Demo1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	private static StringTokenizer st;

	private static final Map<String, Integer> POS_RANK;
	static {
		POS_RANK = new HashMap<>();
		POS_RANK.put("BangZhu", 0);
		POS_RANK.put("FuBangZhu", 1);
		POS_RANK.put("HuFa", 2);
		POS_RANK.put("ZhangLao", 3);
		POS_RANK.put("TangZhu", 4);
		POS_RANK.put("JingYing", 5);
		POS_RANK.put("BangZhong", 6);
	}
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		List<People> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(reader.readLine());
			String name = st.nextToken();
			String position = st.nextToken();
			int contributions = Integer.parseInt(st.nextToken());
			int level = Integer.parseInt(st.nextToken());
			list.add(new People(name, position, contributions, level, i));
		}

		List<People> fixed = new ArrayList<>();
		List<People> others = new ArrayList<>();

		for (People e : list) {
			if (e.position.equals("BangZhu") || e.position.equals("FuBangZhu")) {
				fixed.add(e);
			} else {
				others.add(e);
			}
		}

		Collections.sort(others, (a, b) -> {
			if (b.contributions != a.contributions) {
				return Integer.compare(b.contributions, a.contributions);
			}
			return Integer.compare(a.index, b.index);
		});

		// 更新职位
		for (int i = 0; i < others.size(); i++) {
			People e = others.get(i);
			if (i < 2) {
				e.position = "HuFa";
			} else if (i < 6) {
				e.position = "ZhangLao";
			} else if (i < 13) {
				e.position = "TangZhu";
			} else if (i < 38) {
				e.position = "JingYing";
			} else {
				e.position = "BangZhong";
			}
		}

		List<People> res = new ArrayList<>();
		res.addAll(fixed);
		res.addAll(others);

		Collections.sort(res, (a, b) -> {
			int posCmp = Integer.compare(POS_RANK.get(a.position), POS_RANK.get(b.position));
			if (posCmp != 0)
				return posCmp;
			if (b.level != a.level)
				return Integer.compare(b.level, a.level);
			return Integer.compare(a.index, b.index);
		});

		for (People e : res) {
			writer.println(e.name + " " + e.position + " " + e.level);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	private static class People {
		private String name;
		private String position;
		private int contributions;
		private int level;
		private int index;

		People(String name, String position, int contributions, int level, int index) {
			this.name = name;
			this.position = position;
			this.contributions = contributions;
			this.level = level;
			this.index = index;
		}
	}
}
