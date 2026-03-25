package Day84;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int k = reader.nextInt();
			reader.nextLine();
			char[] chs = reader.nextLine().toCharArray();
			int[] numbers = new int[27];
			int y = 0;
			for (int i = 0; i < n; i++) {
				numbers[chs[i] - 'a' + 1]++;
			}
			for(int i = 1;i<=26;i++) {
				if(numbers[i]%2==1) {
					y++;
				}
//				number[]
			}
			if(y-1<=k) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
