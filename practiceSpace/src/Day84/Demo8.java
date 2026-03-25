package Day84;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			String[] strs = reader.nextLine().split(":");
			int hours = Integer.parseInt(strs[0]);
			StringBuilder sb = new StringBuilder();
			int calcHour;
			if (hours == 12 || hours == 0) {
				calcHour = 12;
			} else {
				calcHour = hours % 12;
			}

			String hourStr = String.format("%02d", calcHour);
			sb.append(hourStr + ":" + strs[1] + " ");
			if (hours < 12) {
				sb.append("AM");
			} else {
				sb.append("PM");
			}

			System.out.println(sb.toString());
		}

		reader.close();
	}

}
