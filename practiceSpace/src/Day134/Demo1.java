package Day134;

public class Demo1 {

	public int maxArea(int[] height) {
		int ans = 0;
		for (int l = 0, r = height.length - 1; l < r;) {
			if (height[l] > height[r]) {
				int maxHeight = height[r];
				ans = Math.max(ans, maxHeight * (r - l));
				r--;
			} else {
				int maxHeight = height[l];
				ans = Math.max(ans, maxHeight * (r - l));
				l++;
			}
		}
		return ans;
	}

}
