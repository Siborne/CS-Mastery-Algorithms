package Day49;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(line.charAt(0))).append(line.substring(1));
        System.out.println(sb.toString());
        reader.close();
	}
	
}
