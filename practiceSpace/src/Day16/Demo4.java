package Day16;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo4 {
	private static int[] num = { 1, 0, 0, 0, 1, 0, 1, 0, 2, 1 };
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		Integer[] arr = new Integer[n];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int sum1 = sum(o1);
				int sum2 = sum(o2);
				if (sum1 != sum2) {
					return Integer.compare(sum1, sum2);
				}
				return Integer.compare(o1, o2);
			}

		});
		
		for(Integer a :arr) {
			writer.print(a+" ");
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int sum(int x) {
		int ans = 0;
		while (x > 0) {
			ans += num[x % 10];
			x /= 10;
		}
		return ans;
	}

}
