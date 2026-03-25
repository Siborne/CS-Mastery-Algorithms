package Day117;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			String line = reader.nextLine();
			char[] chs = line.toCharArray();
			Arrays.sort(chs);
			String sortedLine = new String(chs);
			if (!sortedLine.equals(line)) {
				System.out.println("YES");
				System.out.println(sortedLine);
				continue;
			}
			String reverseLine = new StringBuilder(line).reverse().toString();
			if (!reverseLine.equals(line)) {
				System.out.println("YES");
				System.out.println(reverseLine);
				continue;
			}
			System.out.println("NO");
		}

		reader.close();
	}

}
