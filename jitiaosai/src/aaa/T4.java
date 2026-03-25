package aaa;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		StringBuilder res = new StringBuilder();

		String str = reader.nextLine();
		String target = reader.nextLine();

		int index = 0;
		while (true) {
			int newIndex = str.indexOf(target, index);
			if (newIndex == -1) {
				break;
			}
			res.append(newIndex+1).append(" ");
			index = newIndex + 1;
		}

		System.out.println(res.toString());
		reader.close();
	}

}
