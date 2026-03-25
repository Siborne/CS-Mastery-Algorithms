package Day136;

public class Demo3 {

	class Solution {
		public int subarraySum(int[] nums, int k) {
			int ans = 0;
			for (int start = 0; start < nums.length; start++) {
				int sum = 0;
				for (int end = start; end >= 0; end--) {
					sum += nums[end];
					if (sum == k) {
						ans++;
					}
				}
			}
			return ans;
		}
	}

}
