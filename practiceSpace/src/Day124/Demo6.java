package Day124;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (reader.hasNextLine()) {
			String str = reader.nextLine();
			char maxC = 0;
			for (char c : str.toCharArray()) {
				if (maxC<c) {
					maxC = c;
				}
			}
			str = str.replaceAll(String.valueOf(maxC), maxC+"(max)");
			System.out.println(str);
		}
		
		reader.close();
	}
	
}
