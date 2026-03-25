package Day135;

public class Demo1 {

	public int trap(int[] height) {
		int res = 0;

		int left = 0;
		int right = height.length - 1;
		int leftMax = 0;
		int rightMax = 0;
		while (left < right) {
			leftMax = Math.max(leftMax, height[left]);
			rightMax = Math.max(rightMax, height[right]);
			if (leftMax < rightMax) {
				res += leftMax - height[left++];
			} else {
				res += rightMax - height[right--];
			}
		}

		return res;
	}

}
