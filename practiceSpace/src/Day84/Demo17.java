package Day84;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		for(int i = 1;i<=n;i++) {
			int y = n/i;
			System.out.println(i+" "+y);
		}
		
		reader.close();
	}

}
