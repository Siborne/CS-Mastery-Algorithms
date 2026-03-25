package Day126;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			int m = reader.nextInt();
			if (n == 0 && m == 0) {
				break;
			}

			Set<Integer> setA = new HashSet<>();
			Set<Integer> setB = new HashSet<>();

			for (int i = 0; i < n; i++) {
				setA.add(reader.nextInt());
			}

			for (int i = 0; i < m; i++) {
				setB.add(reader.nextInt());
			}

			List<Integer> res = new ArrayList<>();
			for (int a : setA) {
				if (!setB.contains(a)) {
					res.add(a);
				}
			}

			Collections.sort(res);

			if (res.isEmpty()) {
				System.out.println("NULL");
			} else {
				StringBuilder sb = new StringBuilder();
				for (Integer integer : res) {
					sb.append(integer).append(" ");
				}
				System.out.println(sb.toString().trim());
			}

		}

		reader.close();
	}

}
