package class056;

public class Code04_SimilarStringGroups {

	private static final int MAXN = (int) 3e2 + 1;

	private static int[] father = new int[MAXN];
	private static int[] size = new int[MAXN];
	private static int[] stack = new int[MAXN];

	private static int setSize;

	public int numSimilarGroups(String[] strs) {
		int n = strs.length;
		int m = strs[0].length();
		build(n);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (find(i) != find(j)) {
					int diff = 0;
					for (int k = 0; k < m && diff < 3; k++) {
						if (strs[i].charAt(k) != strs[j].charAt(k)) {
							diff++;
						}
					}
					if (diff == 0 || diff == 2) {
						union(i, j);
					}
				}
			}
		}
		return setSize;
	}

	private static void build(int n) {
		for (int i = 0; i < n; i++) {
			father[i] = i;
		}
		setSize = n;
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
		int xFather = find(x);
		int yFather = find(y);
		if (xFather == yFather) {
			return;
		}

		if (size[xFather] > size[yFather]) {
			father[yFather] = xFather;
			size[xFather] += size[yFather];
		} else {
			father[xFather] = yFather;
			size[yFather] += size[xFather];
		}
		setSize--;
		return;
	}

}
