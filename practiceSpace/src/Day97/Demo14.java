package Day97;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s = reader.nextLine();
		int n = reader.nextInt();
		reader.nextLine();
		while (n-- > 0) {
			String input = reader.nextLine();
			int cnt = 0;
			for (int i = 0, j = 0; i < s.length() && j < input.length(); i++) {
				if (s.charAt(i) == input.charAt(j)) {
					j++;
					cnt++;
				}
			}
			if(cnt==input.length()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		reader.close();
	}

}
