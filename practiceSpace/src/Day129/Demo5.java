package Day129;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int w = reader.nextInt();
		int h = reader.nextInt();
		int v = reader.nextInt();

		for (int i = 0; i < h; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < w; j++) {
				sb.append("Q");
			}
			System.out.println(sb.toString());
		}

		for (int i = 0; i < w; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < v + w; j++) {
				sb.append("Q");
			}
			System.out.println(sb.toString());
		}

		reader.close();
	}

}
