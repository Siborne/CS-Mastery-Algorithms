package Day116;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int a = reader.nextInt();
			String s = String.valueOf(a);
			boolean flag = false;
			if (s.length() >= 3) {
				if (s.startsWith("10")) {
					String xStr = s.substring(2);
					int x = Integer.parseInt(xStr);
					String xtoStr = String.valueOf(x);
					if (x >= 2&&xtoStr.equals(xStr)) {
						flag = true;
					}
				}
			}
			System.out.println(flag ? "YES" : "NO");
		}
		
		reader.close();
	}

}
