package Day129;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		List<int[]> list = new ArrayList<>();

		int n = reader.nextInt();
		for (int i = 1; i <= n; i++) {
			int p = reader.nextInt();
			char[] chs = reader.next().toCharArray();
			int zero = 0;
			int two = 0;
			int one = 0;
			for (char c : chs) {
				if (c == '0') {
					zero++;
				} else if (c == '2') {
					two++;
				} else if (c == '1') {
					one++;
				}
			}
			if (zero >= 1 && two >= 2 && one >= 1) {
				int[] arr = new int[2];
				arr[0] = p;
				arr[1] = i;
				list.add(arr);
			}
		}

		if (list.size() == 0) {
			System.out.println("0");
		} else {
			Collections.sort(list, (o1, o2) -> Integer.compare(o1[0], o2[0]));
			System.out.println(list.get(0)[1]);
		}

		reader.close();
	}

}
