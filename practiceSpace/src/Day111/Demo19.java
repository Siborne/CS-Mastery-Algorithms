package Day111;

import java.util.Scanner;

public class Demo19 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long ans = 0;
		while (reader.hasNextLine()) {
			String[] s = reader.nextLine().split("\\s+");
			for (String string : s) {
				ans += string.length();
			}
		}
		System.out.println(ans);

		reader.close();
	}

}
