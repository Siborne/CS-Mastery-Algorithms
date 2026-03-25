package Day120;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while (t-- > 0) {
			System.out.println(2 * (reader.nextInt() - 1));
		}
		reader.close();
	}

}
