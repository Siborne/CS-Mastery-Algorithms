package LGR_233_Div4;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		int b = reader.nextInt();
		if (a > 0) {
			if (b > 0) {
				System.out.println("NorthEast");
			} else {
				System.out.println("NorthWest");
			}
		} else {
			if (b > 0) {
				System.out.println("SouthEast");
			} else {
				System.out.println("SouthWest");
			}
		}

		reader.close();
	}

}
