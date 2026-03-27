package week1.day6;

import java.util.Arrays;
import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		Integer[] arr = new Integer[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}

		Arrays.sort(arr, (a, b) -> {
			return Integer.compare(Math.abs(a), Math.abs(b));
		});

		StringBuilder sb = new StringBuilder();
		for (Integer a : arr) {
			sb.append(a).append(" ");
		}

		System.out.println(sb.toString().trim());

		reader.close();
	}

}
