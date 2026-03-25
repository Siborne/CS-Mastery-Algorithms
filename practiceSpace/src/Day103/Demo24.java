package Day103;

import java.util.Scanner;

public class Demo24 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s = reader.next();
		if (s.equals("kou")) {
			s = "yukari";
		}
		System.out.println(s);
		reader.close();
	}

}
