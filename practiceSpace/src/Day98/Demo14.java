package Day98;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int temp = n;
		int target = 0;
		while (temp > 0) {
			target = target * 10 + temp % 10;
			temp /= 10;
		}
		System.out.println(target);
		System.out.println(target > n ? "True" : "False");
		reader.close();
	}

}
