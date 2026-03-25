package Day97;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		StringBuilder sb= new StringBuilder(reader.nextLine());
		System.out.println(sb.reverse().toString());
		reader.close();
	}
	
}
