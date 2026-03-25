package Day97;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String[] strs = reader.nextLine().replace("=", "*").split("\\*");
		int ans = Integer.valueOf(strs[0]) * Integer.valueOf(strs[1]);
		System.out.println(ans);

		reader.close();
	}

}
