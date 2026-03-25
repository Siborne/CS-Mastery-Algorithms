package Day85;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			String[] strs = reader.nextLine().split("\\s+");
			StringBuilder sb = new StringBuilder();
			for(String str:strs) {
				sb.append(str.charAt(0));
			}
			System.out.println(sb.toString());
		}

		reader.close();
	}

}
