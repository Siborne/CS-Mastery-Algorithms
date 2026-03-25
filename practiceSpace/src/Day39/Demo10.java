package Day39;

import java.util.Scanner;

public class Demo10 {

	private static boolean foundSolution;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		dfs(arr, 0);
		reader.close();
	}

	private static boolean dfs(int[] arr, int k) {
		if (foundSolution) {
			return true;
		}
		if (k >= 10) {
			if(arr[0]==0||arr[4]==0) {
				return false;
			}
			int a = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
			int b = arr[4] * 1000 + arr[5] * 100 + arr[6] * 10 + arr[1];
			int c = arr[4] * 10000 + arr[5] * 1000 + arr[2] * 100 + arr[1] * 10 + arr[7];
			if(a+b==c) {
				System.out.println(b);
				foundSolution=true;
				return true;
			}
			return false;
		}
		
		for(int i=k;i<arr.length;i++) {
			swap(arr, i, k);
			if(dfs(arr,k+1)) {
				return true;
			}
			swap(arr, i, k);
		}
		return false;
	}

	private static void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}
