package Day119;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int[] arr = new int[n];
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextInt();
				max = Math.max(max, arr[i]);
			}
			int countMax = 0;
			int secondMax = Integer.MIN_VALUE;
			for (int num : arr) {
				if (num == max) {
					countMax++;
				} else if (num > secondMax) {
					secondMax = num;
				}
			}
			if (secondMax == Integer.MIN_VALUE) {
				secondMax = max;
			}

			StringBuilder sb = new StringBuilder();
			for (int num : arr) {
                if (num != max) {
                    sb.append((num - max) + " ");
                } else {
                    if (countMax > 1) {
                        sb.append(0 + " ");
                    } else {
                        sb.append((num - secondMax) + " ");
                    }
                }
            }
			System.out.println(sb.toString());
		}

		reader.close();
	}

}
