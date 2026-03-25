package chuanzhi_8_chusai;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();
		String[] parts = s.split("d");
		long ans = 0;
		for (String part : parts) {
			if (part.length() < 2) {
				continue;
			}
			int rIndex = part.indexOf('r');
			int eIndex = part.indexOf('e');
			int flag = 0;
			int newRIndex;
			int newEIndex;
			while (rIndex != -1 && eIndex != -1) {
				int min = Math.min(rIndex, eIndex);
				int max = Math.max(rIndex, eIndex);
				ans += min+1;

				if (flag == 0) {
					newRIndex = s.indexOf('r', rIndex + 1);
					if (newRIndex != -1) {
						rIndex = newRIndex;
					} else {
						int right = part.length() - max + 1;
						
					}
				}
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
