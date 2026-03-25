package Day104;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		if (a>b) {
			System.out.println("kou");
		}else if (a<b) {
			System.out.println("yukari");
		}else {
			System.out.println("draw");
		}
		
		reader.close();
	}
	
}
