package Day129;

import java.util.Scanner;

public class Demo19 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line = reader.nextLine().toLowerCase();

		System.out.println(line);
		if (line.contains("sss")) {
			String lineSSS = line.replace("sss", "B");
			System.out.println(lineSSS.replace("B", "Bs"));
			System.out.println(lineSSS.replace("B", "sB"));
		} else if (line.contains("ss")) {
			System.out.println(line.replace("ss", "B"));
		}

		reader.close();
	}

}
