package Day148;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String line = reader.nextLine();
		int len =line.length();
		if (len%3!=0) {
			System.out.println("-1");
			return;
		}
		len = len/3*2;
		String part1 = line.substring(0,len);
		String part2 = line.substring(len);
		System.out.println(part1+" "+part2);
		
		reader.close();
	}
	
}
