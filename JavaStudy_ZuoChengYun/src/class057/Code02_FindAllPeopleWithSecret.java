package class057;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code02_FindAllPeopleWithSecret {

	private static final int MAXN = (int) 1e5 + 1;

	private static int[] father = new int[MAXN];
	private static boolean[] secret = new boolean[MAXN];
	private static int[] stack = new int[MAXN];

	private static void build(int n, int first) {
		for (int i = 0; i < n; i++) {
			father[i] = i;
			secret[i] = false;
		}
		father[first] = 0;
		secret[0] = true;
	}

	private static int find(int x) {
		int size = 0;
		while (x != father[x]) {
			stack[size++] = x;
			x = father[x];
		}
		while (size > 0) {
			father[stack[--size]] = x;
		}
		return x;
	}

	private static void union(int x, int y) {
		int fx = find(x);
		int fy = find(y);
		if (fx != fy) {
			father[fx] = fy;
			secret[fy] |= secret[fx];
		}
	}

	public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
		build(n, firstPerson);
		Arrays.sort(meetings, (o1, o2) -> Integer.compare(o1[2], o2[2]));
		int m = meetings.length;
		for (int l = 0, r; l < m;) {
			r = l;
			while (r + 1 < m && meetings[l][2] == meetings[r + 1][2]) {
				r++;
			}
			for (int i = l; i <= r; i++) {
				union(meetings[i][0], meetings[i][1]);
			}
			for (int i = l, a, b; i <= r; i++) {
				a = meetings[i][0];
				b = meetings[i][1];
				if (!secret[find(a)]) {
					father[a] = a;
				}
				if (!secret[find(b)]) {
					father[b] = b;
				}
			}
			l = r + 1;
		}
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (secret[find(i)]) {
				ans.add(i);
			}
		}
		return ans;
	}

}
