package Day51;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int t = reader.nextInt();

		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();

		for (int step = 0; step < t; step++) {
			for(int i = 0;i<n-1;i++) {
				if(chs[i]=='B'&&chs[i+1]=='G') {
					chs[i] = 'G';
					chs[i+1] = 'B';
					i++;
				}
			}
		}
		System.out.println(String.valueOf(chs));
		reader.close();
	}

}
