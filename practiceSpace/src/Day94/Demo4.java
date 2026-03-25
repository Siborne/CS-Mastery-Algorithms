package Day94;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String A = reader.nextLine();
		String B = reader.nextLine();
		int ans = 1;
		for (int i = 0; i < A.length(); i++) {
			ans = A.charAt(i) == '0' && B.charAt(i) == '1' ? 0 : ans;
			ans = A.charAt(i) == '1' && B.charAt(i) == '0' ? ans * 2 : ans;
		}
		System.out.println(ans);
		reader.close();
	}

}
