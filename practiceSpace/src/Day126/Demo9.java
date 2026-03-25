package Day126;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			if (n == 0) {
				break;
			}

			List<int[]> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int[] arr = new int[2];
				arr[0] = reader.nextInt();
				arr[1] = reader.nextInt();
				list.add(arr);
			}

			list.sort((a, b) -> Integer.compare(a[1], b[1]));

			int cnt = 0;
			int lastEnd = -1;
			for (int[] i : list) {
				if (i[0] >= lastEnd) {
					cnt++;
					lastEnd = i[1];
				}
			}
			System.out.println(cnt);

		}

		reader.close();
	}

}
