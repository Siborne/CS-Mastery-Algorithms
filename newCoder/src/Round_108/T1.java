package Round_108;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		boolean flag1 = reader.nextInt() < 425;
//		int[] arr = new int[3];
		boolean flag2 = false;
		for (int i = 0; i < 3; i++) {
			int x = reader.nextInt();
			if (x < 60) {
				flag2 = true;
			}
		}
		System.out.println(flag1 && flag2 ? "YES" : "NO");

		reader.close();
	}

}
