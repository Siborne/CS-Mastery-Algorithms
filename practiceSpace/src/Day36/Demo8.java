package Day36;

import java.util.Scanner;

public class Demo8 {

	private static int[] arr = new int[9];
	private static boolean[] visited = new boolean[9];
	private static int ans;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		solve();
		reader.close();
	}

	private static void solve() {
		backtracing(0);
		System.out.println(ans / 6);
	}

	private static void backtracing(int index) {
		if (index == arr.length) {
			if (arr[0] + arr[1] + arr[2] + arr[3] == arr[3] + arr[4] + arr[5] + arr[6]
					&& arr[3] + arr[4] + arr[5] + arr[6] == arr[0] + arr[7] + arr[8] + arr[6]) {
				ans++;
			}
			return;
		}
		
		for(int i = 0;i<9;i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[index] = i+1;
				backtracing(index+1);
				visited[i] = false;
			}
		}
		
	}

}
