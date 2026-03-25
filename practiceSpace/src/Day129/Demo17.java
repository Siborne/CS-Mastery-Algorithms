package Day129;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[] hours = new int[2];
		int[] minus = new int[2];

		for (int i = 0; i < 2; i++) {
			String[] strs = reader.nextLine().split("\\:");
			hours[i] = Integer.valueOf(strs[0]);
			minus[i] = Integer.valueOf(strs[1]);
		}

		int cnt = 0;
		if (minus[0] > minus[1]) {
			cnt += 60 - minus[0] + minus[1];
			hours[0]++;
		} else {
			cnt += minus[1] - minus[0];
		}

		if (hours[0] > hours[1]) {
			cnt += 24 - hours[0] + hours[1];
		} else {
			cnt += hours[1] - hours[0];
		}
		System.out.println(cnt);

		reader.close();
	}

}
