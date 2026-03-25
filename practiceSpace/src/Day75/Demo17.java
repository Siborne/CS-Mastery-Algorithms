package Day75;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String line = reader.nextLine();
		System.out.printf("%6s",line.substring(0,3));
		
		reader.close();
	}
	
}
