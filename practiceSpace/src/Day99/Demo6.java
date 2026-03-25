package Day99;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();
		int ans = 0;
		for (int i = 0; i < s.length();) {
			int j = s.indexOf("matiji", i);
//			System.out.println(j);
			if (j == -1) {
				break;
			}
			i = j + 6;
			ans++;
		}
		System.out.println(ans);
		reader.close();
	}

}
