package class056;

public class Code03_CouplesHoldingHands {

	private static final int MAXN = (int) 3e1 + 1;

	private static int[] father = new int[MAXN];
	private static int[] size = new int[MAXN];
	private static int[] stack = new int[MAXN];

	private static int setSize;

	public int minSwapsCouples(int[] row) {
		int n = row.length;
		build(n / 2);
		for (int i = 0; i < row.length; i += 2) {
			union(row[i] / 2, row[i + 1] / 2);
		}
		return n / 2 - setSize;
	}

	private static void build(int n) {
		for (int i = 0; i < n; i++) {
			father[i] = i;
			size[i] = 1;
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
	}

}
