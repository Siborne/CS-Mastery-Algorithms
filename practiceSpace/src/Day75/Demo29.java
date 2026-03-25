package Day75;

import java.util.Scanner;

public class Demo29 {

	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		
		float a = reader.nextFloat();
		float b = reader.nextFloat();
		System.out.printf("Area=%.2f",0.5*a*b);
		
		reader.close();
	}
	
}
