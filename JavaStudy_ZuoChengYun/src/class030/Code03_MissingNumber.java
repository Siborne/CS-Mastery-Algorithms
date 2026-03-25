package class030;

public class Code03_MissingNumber {

	public int missingNumber(int[] nums) {
		int errArr = 0;
		int arr = 0;
		for (int i = 0; i < nums.length; i++) {
			errArr ^= nums[i];
			arr ^= i;
		}
		arr ^= nums.length;
		return arr ^ errArr;
	}

}
