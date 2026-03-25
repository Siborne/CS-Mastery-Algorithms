package Day129;

import java.util.Scanner;

public class Demo20 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int max = Integer.MAX_VALUE;
		while (n-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			max = Math.min(max, b / a);
		}
		System.out.println(max);

		reader.close();
	}

}
