package Day81;

import java.util.Scanner;

public class Demo4 {

	private static final int MOD = (int) 1e9 + 7;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();
		int sum = 0;
		String[] arr = s.split("0");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= arr[i].length(); j++) {
				sum += j;
			}
		}
		System.out.println(sum % MOD);
		reader.close();
	}

}
