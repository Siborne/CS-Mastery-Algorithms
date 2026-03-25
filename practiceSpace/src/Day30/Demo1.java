package Day30;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Demo1 {

	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static final PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		StringTokenizer st;
		int[] arr = { 2, 4, 8, 16 };
		int[] max = { 31, 16, 11, 8 };
		while (n-- > 0) {
			st = new StringTokenizer(reader.readLine());
			String A = st.nextToken();
			long b = Long.parseLong(st.nextToken());
			long c = 0;
			long r = 0;
			
			for(int i = 0;i<4;i++) {
				if(A.length()<=max[i]&&(test(A,arr[i])||i==3)) {
					long a = Long.parseLong(A,arr[i]);
					if(a<=b) {
						r=a;
						c++;
					}
				}
			}
			
			writer.println(c!=1?-1:r);
		}

		writer.flush();
		reader.close();
		writer.close();
	}

	private static boolean test(String s, int n) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c - '0' >= n) {
				return false;
			}
		}
		return true;
	}

}
