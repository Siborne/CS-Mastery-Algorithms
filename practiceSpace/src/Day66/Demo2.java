package Day66;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
//			int[] arr = new int[n];
			int sumji = 0;
			int sumou = 0;
			for (int i = 0; i < n; i++) {
//				arr[i] = reader.nextInt();
				int x = reader.nextInt();
				if((i%2==0&&x%2==1)) {
					sumji++;
				}
				if((i%2==1&&x%2==0)) {
					sumou++;
				}
			}
			if(sumji==sumou) {
				System.out.println(sumji);
			}else {
				System.out.println(-1);
			}
		}

		reader.close();
	}

}
