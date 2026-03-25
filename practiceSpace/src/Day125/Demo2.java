package Day125;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line = reader.nextLine().trim();
		String[] parts = line.split("\\s+");

		String aStr = parts[0];
		String bStr = parts[1];

		String fracA = getFractionalPart(aStr);
		String fracB = getFractionalPart(bStr);

		if (fracA.equals(fracB)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		reader.close();
	}

	private static String getFractionalPart(String s) {
		if (s.contains(".")) {
			String frac = s.split("\\.")[1];
			while (frac.length() < 12) {
				frac += "0";
			}
			return frac.substring(0, 12);
		}
		return "000000000000";
	}

}
