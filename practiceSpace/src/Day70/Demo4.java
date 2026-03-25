package Day70;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		System.out.println(n/2);
		if((n&1)==0) {
			for(int x = 1;x<=n/2;x++) {
				System.out.print("2 ");
			}
			System.out.println();
		}else {
			for(int x = 1;x<=n/2-1;x++) {
				System.out.println("2 ");
			}
			System.out.println("3");
		}
		reader.close();
	}
	
}
