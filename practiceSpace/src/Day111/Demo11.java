package Day111;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int T = reader.nextInt();
		while (T-- > 0) {
			int n = reader.nextInt();
			reader.nextLine();
			StringBuilder sb = new StringBuilder(reader.nextLine());
			System.out.println(sb.reverse().toString());
		}
		reader.close();
	}

}
