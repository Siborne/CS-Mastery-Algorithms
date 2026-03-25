package Day71;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		if(n%2==1) {
			System.out.println("Ehab");
		}else {
			System.out.println("Mahmoud");
		}
		
		reader.close();
	}
	
}
