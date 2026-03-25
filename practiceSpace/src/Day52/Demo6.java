package Day52;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += reader.nextDouble();
		}
		
		System.out.printf("%.12f",sum/n);
		reader.close();
	}

}
