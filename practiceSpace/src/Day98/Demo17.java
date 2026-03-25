package Day98;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (n-- > 0) {
			int x = reader.nextInt();
			max = Math.max(max, x);
			min = Math.min(min, x);
		}
		System.out.println(max - min);
		reader.close();
	}

}
