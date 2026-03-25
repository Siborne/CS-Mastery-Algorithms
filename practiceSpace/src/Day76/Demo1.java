package Day76;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[][] nums = new int[4][2];
		for (int i = 0; i < nums.length; i++) {
			nums[i][0] = reader.nextInt();
			nums[i][1] = reader.nextInt();
		}

		int[] a = new int[] { nums[0][0], nums[0][1] };
		int[] b = new int[] { nums[1][0], nums[1][1] };
		int[] c = new int[] { nums[2][0], nums[2][1] };
		int[] d = new int[] { nums[3][0], nums[3][1] };

		int area1 = f(a, b, c);
		int area2 = f(a, b, d);
		int area3 = f(a, c, d);
		int area4 = f(b, c, d);
		double res = 0.25 * (area1 + area2 + area3 + area4);
		System.out.printf("%.2f", res);

		reader.close();
	}

	private static int f(int[] arr1, int[] arr2, int[] arr3) {
		int area = arr1[0]*arr2[1]-arr1[0]*arr3[1]+arr2[0]*arr3[1]
				-arr2[0]*arr1[1]+arr3[0]*arr1[1]-arr3[0]*arr2[1];
		return Math.abs(area);
	}

}
