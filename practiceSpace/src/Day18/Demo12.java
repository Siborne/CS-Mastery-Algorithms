package Day18;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int n = reader.nextInt();
		double c = Math.sqrt(a*a+b*b);
		while(n-->0) {
			int x = reader.nextInt();
			if(x<=c) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
