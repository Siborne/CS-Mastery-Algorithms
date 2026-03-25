package Day125;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();

		int i = 0;
		while (i < line.length() && (Character.isDigit(line.charAt(i)))) {
			i++;
		}
		int value = Integer.parseInt(line.substring(0, i));
		String fromToPart = line.substring(i);
		String[] parts = fromToPart.split("=\\?");
		String formUnit = parts[0];
		String toUnit = parts[1];
		long bytes = 0;
		switch (formUnit) {
		case "B":
			bytes = value;
			break;
		case "KB":
			bytes = value * (1L << 10);
			break;
		case "MB":
			bytes = value * (1L << 20);
			break;
		case "GB":
			bytes = value * (1L << 30);
			break;
		}
		double res = 0.0;
		switch (toUnit) {
		case "B":
			res = bytes;
			break;
		case "KB":
			res = bytes / 1024.0;
			break;
		case "MB":
			res = bytes / (1024.0 * 1024.0);
			break;
		case "GB":
			res = bytes / (1024.0 * 1024.0 * 1024.0);
			break;
		}

		System.out.println(String.format("%.6f", res));

		reader.close();
	}

}
