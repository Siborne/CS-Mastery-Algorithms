package Day43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Demo7 {

	private static Set<String> set = new HashSet<>();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String str = reader.nextLine();
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j > n) {
					break;
				}
				set.add(str.substring(i, i + j));
			}
		}
		int[][] memory = new int[n][6];
		for (int i = 0; i < n; i++) {
			Arrays.fill(memory[i], -1);
		}
		dfs(n - 1, 0, str, memory);
		List<String> res = new ArrayList<>(set);
		res.sort((a, b) -> a.compareTo(b));
		System.out.println(res.size());
		for (String line : res) {
			System.out.println(line);
		}
		reader.close();
	}

	private static boolean dfs(int i, int j, String str, int[][] memory) {
		int n = str.length();
		if (i < 0) {
			return true;
		}
		if (memory[i][j] != -1) {
			return memory[i][j] == 1;
		}
		int mask = 0;
		for (int k = i + 1; k <= Math.min(n - 1, i + j); k++) {
			mask |= 1 << (str.charAt(k) - 'a');
		}
		boolean res = false;
		for (int k = i; k >= Math.max(0, i - 4); k--) {
			char c = str.charAt(k);
			if ((mask & (1 << (c - 'a'))) != 0) {
				break;
			}
			boolean flag = dfs(k-1,i-k+1,str,memory);
			if (flag) {
				set.remove(str.substring(k, i + 1));
			}
			res |= flag;
		}
		memory[i][j] = res ? 1 : 0;
		return res;

	}

}
