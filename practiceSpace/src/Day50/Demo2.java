package Day50;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = 0;
		int y = 0;
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				int a = reader.nextInt();
				if(a==1) {
					x = i;
					y = j;
				}
			}
		}
		System.out.println(Math.abs(x-3)+Math.abs(y-3));
		reader.close();
	}
	
}
