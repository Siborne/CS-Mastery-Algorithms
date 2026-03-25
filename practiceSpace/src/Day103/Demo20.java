package Day103;

import java.util.Scanner;

public class Demo20 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		System.out.println(c >= a * b ? "YES" : "NO");

		reader.close();
	}

}
