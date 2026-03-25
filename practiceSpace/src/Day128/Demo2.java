package Day128;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[] f = new int[31];
		f[0] = 0;
		for (int i = 1; i < f.length; i++) {
			f[i] = f[i-1]*2+1;
		}
		
		int t = reader.nextInt();
		while (t-- > 0) {
			int k = reader.nextInt();
			System.out.println(f[k]);
		}

		reader.close();
	}

}
