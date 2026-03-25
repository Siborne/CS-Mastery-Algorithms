package chuanzhi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class T4_2 {
//	private static List<Integer> list = new ArrayList<Integer>();
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
	private static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);
		for (int i = 1; i <= 9; i++) {
			getNum(i);
		}
		int t = Integer.parseInt(reader.readLine());
//		for(int i = 0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}

		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			boolean flag = false;
			for(int num:map.keySet()) {
				if(num>=l&&num<=r) {
					writer.println(num);
					flag = true;
					break;
				}
			}

			if (!flag) {
				writer.println(-1);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	public static void getNum(int level) {

		List<Integer> arr = new ArrayList<Integer>();
		boolean[] brr = new boolean[level + 1];
		dfs(0, arr, level, brr);
	}

	public static void dfs(int now, List<Integer> arr, int level, boolean brr[]) {
		if (arr.size() == level) {
			int res = 0;
			for (int i = 0; i < level; i++) {
				res = res * 10 + arr.get(i);
			}
//			list.add(res);
			map.put(res, 1);
		}

		for (int i = 1; i <= level; i++) {
			if (brr[i]) {
				continue;
			}

			brr[i] = true;
			arr.add(i);
			dfs(now + 1, arr, level, brr);
			arr.remove(arr.size() - 1);
			brr[i] = false;
		}

	}

}
