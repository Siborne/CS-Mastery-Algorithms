package Day111;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int T = reader.nextInt();
		while (T-- > 0) {
			int n = reader.nextInt();
			reader.nextLine();
			String[] s = reader.nextLine().split("\\s+");
			StringBuilder sb = new StringBuilder();
			for (String string : s) {
				sb.append(string);
			}
			System.out.println(sb.reverse().toString());
		}

		reader.close();
	}

}
