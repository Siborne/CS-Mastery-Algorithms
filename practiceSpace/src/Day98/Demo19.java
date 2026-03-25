package Day98;

import java.util.Scanner;

public class Demo19 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chs.length; i += n) {
			sb.append(chs[i]);
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
