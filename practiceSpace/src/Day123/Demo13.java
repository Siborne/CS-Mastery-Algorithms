package Day123;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int m = reader.nextInt();
			int n = reader.nextInt();

			boolean flag = false;
			for (int i = m; i <= n; i++) {
				if (isFlag(i)) {
					flag = true;
					System.out.print(i+" ");
				}
			}
			if (!flag) {
				System.out.println("no");
			}else {
				System.out.println();
			}
		}

		reader.close();
	}

	private static boolean isFlag(int n) {
		int a1 = n % 10;
		int a2 = n / 10 % 10;
		int a3 = n / 100;
		return (int) (Math.pow(a1, 3) + Math.pow(a2, 3) + Math.pow(a3, 3)) == n;
	}

}
