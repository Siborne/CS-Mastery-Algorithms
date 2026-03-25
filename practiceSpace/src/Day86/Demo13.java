package Day86;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int sum = n * (n + 1) / 2;
		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		int sum0 = 0;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			if (chs[i] == '0') {
				temp++;
				sum0 += temp;
			} else {
				temp = 0;
			}
		}
		System.out.println(sum - sum0);

		reader.close();
	}

}
