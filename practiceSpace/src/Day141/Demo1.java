package Day141;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String line = in.nextLine();
		StringTokenizer st = new StringTokenizer(line);
		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			sb.append(Character.toUpperCase(word.charAt(0)));
		}
		System.out.println(sb.toString());
		in.close();
	}
}
