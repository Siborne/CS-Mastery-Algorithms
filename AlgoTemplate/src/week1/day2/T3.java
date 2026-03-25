package week1.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		boolean[] isPrime = new boolean[n + 1];
		for (int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j < isPrime.length; j += i) {
					isPrime[j] = false;
				}
			}
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				list.add(i);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i + 1) - list.get(i) == 2) {
				sb.append(list.get(i) + " " + list.get(i + 1)).append("\n");
			}
		}
		if (sb.toString().trim().isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println(sb.toString());
		}
		
		reader.close();
	}

}
