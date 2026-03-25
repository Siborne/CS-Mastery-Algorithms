package Day53;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		boolean[] arr = new boolean[n];
		int p = reader.nextInt();
		for (int i = 0; i < p; i++) {
			int x = reader.nextInt()-1;
			arr[x] = true;
		}
		int q = reader.nextInt();
		for (int i = 0; i < q; i++) {
			arr[reader.nextInt() - 1] = true;
		}

		boolean flag = true;
		for (boolean a : arr) {
			if (!a) {
				flag = a;
				break;
			}
		}
		System.out.println(flag ? "I become the guy." : "Oh, my keyboard!");
		reader.close();
	}

}
