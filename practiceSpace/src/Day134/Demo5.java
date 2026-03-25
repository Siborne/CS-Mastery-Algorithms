package Day134;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] a = reader.nextLine().toCharArray();
		char[] b = reader.nextLine().toCharArray();

		int len = a.length;
		int ans = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] != b[i]) {
				a[i] = a[i] == 'o' ? '*' : 'o';
				a[i + 1] = a[i + 1] == 'o' ? '*' : 'o';
				ans++;
			}
		}
		System.out.println(ans);

		reader.close();
	}

}
