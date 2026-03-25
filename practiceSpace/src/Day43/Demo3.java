package Day43;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs = reader.nextLine().toCharArray();
		long ans = 0;
		int[] b = new int[4];
		int[] l = new int[4];
		int[] u = new int[4];
		int[] e = new int[4];

		for (int i = 0; i < chs.length; i++) {
			if (i % 4 == 0) {
				switch (chs[i]) {
				case 'b':
					b[0]++;
					break;
				case 'l':
					l[0]++;
					break;
				case 'u':
					u[0]++;
					break;
				case 'e':
					e[0]++;
					break;
				}
			} else if (i % 4 == 1) {
				switch (chs[i]) {
				case 'b':
					b[1]++;
					break;
				case 'l':
					l[1]++;
					break;
				case 'u':
					u[1]++;
					break;
				case 'e':
					e[1]++;
					break;
				}
			} else if (i % 4 == 2) {
				switch (chs[i]) {
				case 'b':
					b[2]++;
					break;
				case 'l':
					l[2]++;
					break;
				case 'u':
					u[2]++;
					break;
				case 'e':
					e[2]++;
					break;
				}
			} else {
				switch (chs[i]) {
				case 'b':
					b[3]++;
					break;
				case 'l':
					l[3]++;
					break;
				case 'u':
					u[3]++;
					break;
				case 'e':
					e[3]++;
					break;
				}
			}
		}
		
		for(int i = 0;i<4;i++) {
			int temp = Math.min(b[i%4], Math.min(l[(i+1)%4], Math.min(u[(i+2)%4], e[(i+3)%4])));
			ans = Math.max(ans, temp);
		}
//		long ff = Math.min(b[0], Math.min(l[1], Math.min(u[2], e[3])));
		
		System.out.println(ans);
		reader.close();
	}

}
