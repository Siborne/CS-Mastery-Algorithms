package class030;

public class Code04_SingleNumber {
	
	public int singleNumber(int[] nums) {
		int ans = 0;
		for (int num : nums) {
			ans ^= num;
		}
		return ans;
	}
	
}
