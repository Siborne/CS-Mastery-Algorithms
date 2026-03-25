package Day75;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo46 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			st = new StringTokenizer(reader.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int minh = arr[k - 1];
//			System.out.println("minh:"+minh);
			Arrays.sort(arr);
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(arr[i], i);
			}
			boolean flag = true;
			int nowh = minh;
			while (flag) {
//				if (map.getOrDefault(nowh, -1) == -1 || map.get(nowh) == n - 1) {
//					break;
//				}
//				System.out.println("map.get:"+map.get(nowh)+" "+nowh);
				if (map.get(nowh) == n - 1) {
					break;
				}
				// 1 2 2 3 6 9
				boolean can = false;
				for (int i = minh; i > 0; i--) {
					int tempIndex = map.getOrDefault(nowh + minh, -1);
//					System.out.println("tempIndex:"+tempIndex);
					if (tempIndex != -1) {
						nowh += i;
						can = true;
						break;
					}
				}
				if (!can) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
