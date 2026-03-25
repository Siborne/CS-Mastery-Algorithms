package Day97;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int odd = 0;
		int even = 0;
		while (n-- > 0) {
			int x = reader.nextInt();
			if ((x & 1) == 1) {
				odd++;
			} else {
				even++;
			}
		}
		System.out.println(odd + " " + even);
		reader.close();
	}

}
