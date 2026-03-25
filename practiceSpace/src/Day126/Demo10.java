package Day126;

import java.util.Arrays;
import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();

		while (n-- > 0) {
			double[] arr = new double[3];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextDouble();
			}
			Arrays.sort(arr);
			if (arr[0]+arr[1]>arr[2]) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
