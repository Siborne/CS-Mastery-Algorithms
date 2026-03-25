package Day129;

import java.util.Scanner;

public class Demo18 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line1 = reader.nextLine();
		String line2 = reader.nextLine();
		long year1 = parseYear(line1);
		long year2 = parseYear(line2);

		System.out.println(Math.abs(year1 - year2));

		reader.close();
	}

	private static long parseYear(String s) {
		// TODO Auto-generated method stub
		if (s.startsWith("AD")) {
			return Long.parseLong(s.substring(3));
		} else {
			String[] parts = s.split("\\s+");
			long bc = Long.parseLong(parts[0]);
			return -(bc - 1);
		}
	}

}
