package Day118;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line = reader.nextLine();
		boolean flag = false;
		int index = line.indexOf("AB");
		if (index != -1) {
			index = line.indexOf("BA", index + 2);
			if (index != -1) {
				flag = true;
			}
		}
		if (!flag) {
			index = line.indexOf("BA");
			if (index != -1) {
				index = line.indexOf("AB", index + 2);
				if (index != -1) {
					flag = true;
				}
			}
		}
		System.out.println(flag ? "YES" : "NO");
		reader.close();
	}

}
