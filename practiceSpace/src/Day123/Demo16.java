package Day123;

import java.util.Iterator;
import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			int x = 1;
			for (int i = 1; i < n; i++) {
				x+=1;
				x*=2;
			}
			System.out.println(x);
		}

		reader.close();
	}

}
