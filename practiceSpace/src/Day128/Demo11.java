package Day128;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String target = "You are right, but ";

		String pre = reader.nextLine().substring(0, 19);
		if (pre.contains(target)) {
			System.out.println("AI");
		} else {
			System.out.println("Human");
		}

		reader.close();
	}

}
