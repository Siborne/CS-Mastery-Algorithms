package Day85;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Demo11_2 {
	private final static int MOD = 998244353;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		long sumA = 0;
		long sumB = 0;
		long sumBlb = 0;
		List<Integer> list = new ArrayList<>();
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if (isPower(x)) {
				sumA = (sumA + x) % MOD;
			} else {
				list.add(x);
				sumB = (sumB + x) % MOD;
				sumBlb = (sumBlb + lowbit(x)) % MOD;
			}
		}
		long ans = (sumA + sumB) % MOD;
		while (q-- > 0) {
			int op = Integer.parseInt(reader.readLine());
			if (op == 1) {
				ans = ((sumA + sumBlb) % MOD + ans) % MOD;
				sumA = (sumA * 2) % MOD;
				for(int i = list.size()-1;i>=0;i--) {
					int num = list.get(i);
					int lb = lowbit(num);
					int newNum = num + lb;
					int newlb = lowbit(newNum);
					if (isPower(newNum)) {
						sumA = (sumA + newNum) % MOD;
						sumB = (sumB - newNum + MOD) % MOD;
						sumBlb = (sumBlb - lb + MOD) % MOD;
						Collections.swap(list, i, list.size()-1);
						list.remove(list.size()-1);
					} else {
						sumB = (sumB - num + newNum + MOD) % MOD;
						sumBlb = (sumBlb - lb + newlb + MOD) % MOD;
						list.set(i, newNum);
					}
				}
			} else {
				writer.println(ans % MOD);
			}
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean isPower(int x) {
		return (x & (x - 1)) == 0;
	}

	private static int lowbit(int x) {
		return x & (-x);
	}

}
