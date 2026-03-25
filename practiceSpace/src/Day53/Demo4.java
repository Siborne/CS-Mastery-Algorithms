package Day53;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String line = reader.nextLine();
		if(line.contains("H")||line.contains("Q")||line.contains("9")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		reader.close();
	}
	
}
