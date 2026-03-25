package Day137;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line = reader.nextLine();
		int cnt = 0;
		List<Integer> ans = new ArrayList<>();

		for (int start = 0, len = 1; start + len <= line.length(); len = len == 10 ? 1 : len + 1) {
			int num = 0;
			for (int i = start; i < start + len; i++) {
				num <<= 1;
				num += line.charAt(i) - '0';
			}
			cnt++;
			ans.add(num);
			start += len;
		}
		
		System.out.println(cnt);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ans.size(); i++) {
			if (i > 0) {
				sb.append(" ");
			}
			sb.append(ans.get(i));
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
