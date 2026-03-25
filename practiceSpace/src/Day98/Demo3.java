package Day98;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		for(int i = 0;i<=n/2;i++) {
			int a = i;
			int b = n-a;
			System.out.println(n+"="+a+"+"+b);
		}
		reader.close();
	}
	
}
