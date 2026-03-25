package Day103;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		int b = reader.nextInt();
		int ans1 = a / b;
		int ans2 = a % b;
		System.out.println(ans1 + " " + ans2);

		reader.close();
	}

}
