package week3.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int[] size;
	private static int[] father;

	private static int find(int x) {
		if (father[x] != x) {
			father[x] = find(father[x]);
		}
		return father[x];
	}

	private static void union(int a, int b) {
		int fa = find(a);
		int fb = find(b);
		if (fa == fb) {
			return;
		}

		if (size[fa] < size[fb]) {
			father[fa] = fb;
			size[fb] += size[fa];
		} else {
			father[fb] = fa;
			size[fa] += size[fb];
		}
	}

	private static void init(int x) {
		size = new int[x + 1];
		father = new int[x + 1];
		for (int i = 0; i <= x; i++) {
			size[i] = 1;
			father[i] = i;
		}
	}

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		init(n);
		
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(reader.readLine());
			char op = st.nextToken().charAt(0);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (op == 'M') {
				union(a, b);
			} else {
				writer.println(find(a) == find(b) ? "Yes" : "No");
			}
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
