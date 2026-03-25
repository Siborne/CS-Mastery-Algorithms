package Day129;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int h = reader.nextInt();
		int w = reader.nextInt();
		char[] chs = "2025".toCharArray();
		
		for (int i = 0; i < h; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < w; j++) {
				sb.append(chs[(i+j)%4]);
			}
			System.out.println(sb.toString());
		}
		
		reader.close();
	}

}
