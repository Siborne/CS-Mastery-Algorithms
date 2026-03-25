package Day51;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			if(x==1) {
				System.out.println("HARD");
				return;
			}
		}
		System.out.println("EASY");
		reader.close();
	}

}
