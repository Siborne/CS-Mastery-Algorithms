package Day85;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int x = reader.nextInt();
			System.out.println(1+" "+(x-1));
		}

		reader.close();
	}

}
