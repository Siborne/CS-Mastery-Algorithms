package Day93;

import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] strArr = reader.nextLine().split("-");
		int year = Integer.parseInt(strArr[0]);
		int month = Integer.parseInt(strArr[1]);
		int day = Integer.parseInt(strArr[2]);
		int sum = 0;
		int[] arr1 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] arr2 = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			for (int i = 0; i < month - 1; i++) {
				sum += arr2[i];
			}
		} else {
			for (int i = 0; i < month - 1; i++) {
				sum += arr1[i];
			}
		}
		System.out.println(sum + day);
		reader.close();
	}
}
