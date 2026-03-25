package Day140;

public class Demo1 {

	public int maximumWealth(int[][] accounts) {
		int ans = 0;
		for (int[] account : accounts) {
			int x = 0;
			for (int money : account) {
				x += money;
			}
			ans = Math.max(ans, x);
		}
		return ans;
	}

}
