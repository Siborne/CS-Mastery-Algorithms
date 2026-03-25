package Day120;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int k = reader.nextInt();
		reader.nextLine();
		String line = reader.nextLine();
		int mid = line.length() - k;
		String right = line.substring(mid);
		String left = line.substring(0, mid);
		System.out.println(right + left);
		reader.close();
	}

}
