package Day45;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Demo8 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			map.put(num, i+1);
		}

		int q = Integer.parseInt(reader.readLine());
		while (q-- > 0) {
			int x = Integer.parseInt(reader.readLine());
			if(map.containsKey(x)) {
				System.out.println(map.get(x));
			}else {
				System.out.println(0);
			}
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}


}
