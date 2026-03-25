package s2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class T13_3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		char[] chs = reader.readLine().toCharArray();
		int[][] nums = new int[n + 1][26];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 26; j++) {
				nums[i + 1][j] = nums[i][j];
			}
			nums[i + 1][chs[i] - 'a']++;
		}
		while (q-- > 0) {
			st = new StringTokenizer(reader.readLine());
			int l = Integer.parseInt(st.nextToken()) - 1;
			int r = Integer.parseInt(st.nextToken());
			int even = 0;
			for (int j = 0; j < 26; j++) {
				int temp = nums[r][j] - nums[l][j];
				even += ((temp & 1) == 0 ? 1 : 0);
			}
			int odd = 26 - even;
			System.out.println(even + " " + odd);
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
