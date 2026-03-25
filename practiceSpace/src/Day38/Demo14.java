package Day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo14 {

	private static int[] arr = new int[9];
	private static boolean[] visited = new boolean[9];
	private static List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

	private static void solve() {
		dfs(0);
		System.out.println(getAnswer() / 2);
	}

	private static void dfs(int step) {
		if (step == visited.length) {
			StringBuilder sb = new StringBuilder();
			for (int n : arr) {
				sb.append(n);
			}
			list.add(sb.toString());
			return;
		}

		for (int i = 0; i < 9; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[step] = i + 1;
				dfs(step + 1);
				visited[i] = false;
			}
		}
	}

	private static int getAnswer() {
		int ans = 0;
		for (String s : list) {
			for(int i = 1;i<s.length();i++) {
				int num1 = Integer.parseInt(s.substring(0,i));
				int num2 = Integer.parseInt(s.substring(i));
				if(test(String.valueOf(num1*num2))) {
					ans++;
				}
			}
		}
		return ans;
	}

	private static boolean test(String str) {
		char[] chs = str.toCharArray();
		Arrays.sort(chs);
		return "123456789".equals(String.valueOf(chs));
	}

}
