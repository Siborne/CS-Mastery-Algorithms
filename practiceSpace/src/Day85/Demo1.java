package Day85;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		int[] brr = {1,2,1,3,5,6,4};
		System.out.println(solve(brr));
	
	}

	private static int solve(int[] nums) {
		if (nums.length == 1) {
			return 0;
		}
		if (nums.length > 1) {
			if (nums[0] > nums[1]) {
				return 0;
			}
			if (nums[nums.length - 1] > nums[nums.length - 2]) {
				return nums.length - 1;
			}
		}

		int l = 1;
		int r = nums.length - 2;
		int ans = -1;
		while (l <= r) {
			int mid = l +( (r - l) >> 1);
			if (nums[mid-1] > nums[mid]) {
				r = mid - 1;
			} else if (nums[mid] < nums[mid+1]) {
				l = mid + 1;
			} else {
				ans = mid;
				break;
			}
		}
		return ans;
	}

}
