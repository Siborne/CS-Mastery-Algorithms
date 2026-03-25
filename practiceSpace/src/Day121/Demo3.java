package Day121;

public class Demo3 {

	public int minCostClimbingStairs(int[] cost) {
		int len = cost.length;
		int[] arr = new int[len + 1];
		arr[len] = cost[len - 1];
		for (int i = len - 2; i >= 0; i--) {
			arr[i] = cost[i] + Math.min(arr[i - 1], arr[i - 2]);
		}
		return Math.min(arr[0], arr[1]);
	}

}
