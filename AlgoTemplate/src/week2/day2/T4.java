package week2.day2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		
		st.nextToken();
		int n = (int) st.nval;
		
		// �? 特殊情况：n<3时直接输�?0
		if (n < 3) {
			System.out.println(0);
			return;
		}
		
		long[] prefix = new long[n + 1];
		
		for (int i = 1; i <= n; i++) {
			st.nextToken();
			long x = (long) st.nval;  // �? 直接读long，避免int溢出
			prefix[i] = prefix[i - 1] + x;
		}

		long sum = prefix[n];

		if (sum % 3 != 0) {
			writer.println(0);
		} else {
			long target = sum / 3;
			long ans = 0;
			long cnt = 0;

			// 统计后缀中等�?2*target的个数（j的范围是[i, n-1]，即prefix[j]=2*target�?
			for (int i = n - 1; i >= 2; i--) {
				if (prefix[i] == 2 * target) {
					cnt++;
				}
			}

			// 枚举第二段开始位置i（从2到n-1�?
			for (int i = 2; i <= n - 1; i++) {
				if (prefix[i - 1] == target) {  // 第一段和等于target
					ans += cnt;  // �?有后面的2*target位置都可以作为j
				}
				if (prefix[i] == 2 * target) {  // 当前位置从后�?中移�?
					cnt--;
				}
			}

			writer.println(ans);
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}
}