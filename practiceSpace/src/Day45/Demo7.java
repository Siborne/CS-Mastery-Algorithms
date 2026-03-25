package Day45;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Demo7 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);
		int n = Integer.parseInt(reader.readLine());
		List<Node> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			list.add(new Node(i + 1, num));
		}

		Collections.sort(list, (a, b) -> Integer.compare(a.num, b.num));

//		for (Node i : list) {
//			System.out.println(i.index + " " + i.num);
//		}

		int q = Integer.parseInt(reader.readLine());
		while (q-- > 0) {
			int x = Integer.parseInt(reader.readLine());
			int l = 0;
			int r = n - 1;
			boolean flag = false;
			while (l <= r) {
				if (flag) {
					break;
				}
				int mid = l + (r - l) / 2;
				if (x < list.get(mid).num) {
					r = mid - 1;
				} else if (x > list.get(mid).num) {
					l = mid + 1;
				} else {
					writer.println(list.get(mid).index);
					flag = true;
				}
			}
			if (!flag) {
				writer.println(0);
			}
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}

	private static class Node {
		int index;
		int num;

		private Node(int index, int num) {
			this.index = index;
			this.num = num;
		}
	}

}
