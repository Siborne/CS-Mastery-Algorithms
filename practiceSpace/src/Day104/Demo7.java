package Day104;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String line = reader.nextLine();
		String ans = reader.nextLine();
		if (line.equals(ans)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		reader.close();
	}
	
}
