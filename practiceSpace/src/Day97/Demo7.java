package Day97;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while (reader.hasNext()) {
			String str = reader.nextLine();
			String[] strs = str.split("\\s+");
			int a = Integer.valueOf(strs[0]);
			int b = Integer.valueOf(strs[1]);
			int c = Integer.valueOf(strs[2]);
			int ans = a * b % c;
			System.out.println(ans);
		}

		reader.close();
	}

}
