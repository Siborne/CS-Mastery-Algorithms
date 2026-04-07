package week2.day2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	// private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final Map<Character, Integer> map;

	static {
		map = new HashMap<>();
		map.put('P', 3);
		map.put('p', 2);
		map.put('G', 1);
		map.put('g', 0);
		map.put('m', 0);
	}

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(reader.readLine());
		while (T-- > 0) {
			String line = reader.readLine();
			int[] arr = new int[line.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = map.get(line.charAt(i));
			}
			int[] brr = new int[line.length() + 1];
			for (int i = 0; i < arr.length; i++) {
				brr[i + 1] = brr[i] + arr[i];
			}
			int q = Integer.parseInt(reader.readLine());
			while (q-- > 0) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				int l = Integer.parseInt(st.nextToken()) - 1;
				int r = Integer.parseInt(st.nextToken());
				writer.println(brr[r] - brr[l]);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
