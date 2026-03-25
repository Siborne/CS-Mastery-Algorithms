package Day59;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int k = reader.nextInt();
		int l = reader.nextInt();
		int c = reader.nextInt();
		int d = reader.nextInt();
		int p = reader.nextInt();
		int nl = reader.nextInt();
		int np = reader.nextInt();
		int kl = k*l;
		int cd = c*d;
		int min = Integer.MAX_VALUE;
		min = Math.min(p/(np*n), min);
		min = Math.min(kl/(nl*n), min);
		min = Math.min(cd/n, min);
		System.out.println(min);
		reader.close();
	}
	
	
}
