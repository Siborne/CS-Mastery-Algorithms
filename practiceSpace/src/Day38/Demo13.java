package Day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo13 {
	private static List<String> list = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		List<Integer> t = new ArrayList<>();
		dfs(arr, t);
		System.out.println(ff() / 2);
	}

	private static void dfs(int[] arr, List<Integer> t) {
		if (t.size() == 9) {
			StringBuilder sb = new StringBuilder();
			for (Integer l : t) {
				sb.append(t);
			}
			list.add(sb.toString());
			return;
		}

		for (int i = 1; i <= 9; i++) {
			if (arr[i] == 1) {
				continue;
			}
			arr[i] = 1;
			t.add(i);
			dfs(arr, t);
			t.remove(t.size() - 1);
			arr[i] = 0;
		}
	}

	private static int ff() {
		int count = 0;
		for(String s:list) {
			for(int i = 1;i<s.length();i++) {
				int num1 = Integer.parseInt(s.substring(0,i));
				int num2 = Integer.parseInt(s.substring(i));
				if(panduan(String.valueOf(num1*num2))) {
					count++;
				}
			}
		}
		return count;
	}

	private static boolean panduan(String str) {
		char[] c = str.toCharArray();
		Arrays.sort(c);
		return "123456789".equals(String.valueOf(c));
	}

}
