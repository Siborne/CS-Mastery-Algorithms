package Day128;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo15 {

	private static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int i = 2;
		while (list.size() < 2025) {
			if (isPrime(i)) {
				list.add(i);
			}
			i++;
		}

		System.out.println(list.get(2024));
		reader.close();
	}

	private static boolean isPrime(int x) {
		if (x < 2) {
			return false;
		}
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
