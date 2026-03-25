package Day98;

import java.util.Scanner;

public class Demo18 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				if(i%3!=0) {
					System.out.print("*");
				}else {
					System.out.print("|");
					break;
				}
			}
			System.out.println();
		}
		reader.close();
	}

}
