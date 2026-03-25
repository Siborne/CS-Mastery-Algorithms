package Day98;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s = reader.nextLine();
		String target = reader.nextLine();
		System.out.println(s.indexOf(target) == -1 ? -1 : s.indexOf(target) + 1);
		reader.close();
	}

}
