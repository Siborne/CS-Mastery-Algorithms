package Day79;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			reader.nextLine();
			char[] chs = reader.nextLine().toCharArray();
			int first = -1;
			int next = 0;
			for(int i = 0;i<n;i++) {
				if(chs[i]=='B') {
					next = i;
					if(first == -1) {
						first = i;
					}
				}
			}
			System.out.println(next-first+1);
		}

		reader.close();
	}

}
