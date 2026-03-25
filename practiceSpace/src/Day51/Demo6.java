package Day51;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String line = reader.nextLine();
		StringBuilder sb  = new StringBuilder(reader.nextLine());
		if(line.equals(sb.reverse().toString())) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		reader.close();
	}
	
}
