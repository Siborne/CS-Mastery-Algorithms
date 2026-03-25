package Day84;

import java.util.Scanner;

public class Demo35 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double k = reader.nextDouble();
		int n = reader.nextInt();
		System.out.printf("%."+n+"f",k);
		
		reader.close();
	}
	
}
