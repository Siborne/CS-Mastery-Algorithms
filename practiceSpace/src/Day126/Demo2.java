package Day126;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		while (n-- > 0) {
			String line = reader.readLine();
			byte[] bytes = line.getBytes();
			int cnt = 0;
			for (int i = 0; i < bytes.length; i++) {
				if (bytes[i] < 0) {
					cnt++;
					i++;
				}
			}
			System.out.println(cnt);
		}

		reader.close();
	}

}
