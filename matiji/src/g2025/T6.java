package g2025;

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs = reader.nextLine().toCharArray();
		long count = 0;
		int n = chs.length;
		for (int i = 0; i < n; i++) {
			for(int j = n-1;j>=i;j--) {
				int l = i;
				int r = j;
				while(l<=r) {
					if(chs[l]==chs[r]) {
						l++;
						r--;
					}else {
						break;
					}
				}
				if(l>=r) {
					count++;
				}
			}
		}

		System.out.println(count);
		reader.close();
	}

}
