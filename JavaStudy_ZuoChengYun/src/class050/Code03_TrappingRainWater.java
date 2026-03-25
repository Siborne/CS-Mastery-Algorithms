package class050;

public class Code03_TrappingRainWater {

	public int trap(int[] height) {
		int l = 1;
		int r = height.length - 2;
		int lMax = height[0];
		int rMax = height[height.length - 1];
		int ans = 0;
		while (l <= r) {
			if (lMax <= rMax) {
				ans += Math.max(0, lMax - height[l]);
				lMax = Math.max(lMax, height[l++]);
			} else {
				ans += Math.max(0, rMax - height[r]);
				rMax = Math.max(rMax, height[r--]);
			}
		}
		return ans;
	}

}
