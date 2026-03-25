package Day139;

public class Demo9 {

	private static final int MAXN = (int) 1e3 + 1;

	private static int[] stack = new int[MAXN];

	private static int head;

	public int calPoints(String[] operations) {
		for (String op : operations) {
			if ("+".equals(op)) {
				stack[head] = stack[head - 1] + stack[head - 2];
				head++;
			} else if ("D".equals(op)) {
				stack[head] = stack[head - 1] * 2;
				head++;
			} else if ("C".equals(op)) {
				head--;
			} else {
				stack[head] = Integer.parseInt(op);
				head++;
			}
		}
		int ans = 0;
		while (head > 0) {
			ans += stack[--head];
		}
		return ans;
	}

}
