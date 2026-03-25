package Day42;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo11 {

	private static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			String line = reader.nextLine();
			System.out.println(check(line));
		}

		reader.close();
	}

	private static int check(String line) {
		if (map.containsKey(line)) {
			return map.get(line);
		}
		if (line.contains("LOL")) {
			return -1;
		} else if (!line.contains("*")) {
			return 0;
		}
		int flag = -1;
		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i)=='*') {
				StringBuilder sb = new StringBuilder(line);
				sb.setCharAt(i, 'L');
				int res = check(sb.toString());
				if(res==-1) {
					map.put(line, 1);
					return 1;
				}else if(res==0) {
					flag = 0;
				}
				sb.setCharAt(i, 'O');
				res = check(sb.toString());
				if(res==-1) {
					map.put(line, 1);
					return 1;
				}else if(res==0) {
					flag = 0;
				}
			}
		}
		map.put(line, flag);
		return flag;
	}

}
