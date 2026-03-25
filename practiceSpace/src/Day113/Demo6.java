package Day113;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		String[] strs = line.split("\\+");
		int sum = 0;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].contains("*")) {
				String[] b = strs[i].split("\\*");
				int temp = Integer.parseInt(b[0]);
				for (int j = 1; j < b.length; j++) {
					temp = (temp * Integer.parseInt(b[j]) % (int) 1e4);
				}
				sum += temp;
			} else {
				sum = (sum + Integer.parseInt(strs[i])) % (int) 1e4;
			}
		}
		System.out.println(sum % (int) 1e4);
		reader.close();
	}

}
