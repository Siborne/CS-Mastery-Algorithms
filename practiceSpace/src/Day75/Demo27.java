package Day75;

import java.util.Scanner;

public class Demo27 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double x = reader.nextDouble();
		double y = reader.nextDouble();
		double area = x*y;
		double perimeter = (x+y)*2;
		System.out.printf("Area=%.6f\n", area);
		System.out.printf("Perimeter=%.6f\n", perimeter);
		reader.close();

	}

}
