package Day69;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			String line = reader.nextLine();
			String[] str = line.split("\\+");
			System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]));
		}

		reader.close();
	}

}
