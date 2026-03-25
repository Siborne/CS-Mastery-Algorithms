package Day50;

import java.util.Scanner;

public class Demo8 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String line = reader.nextLine();
		char[] lowerCase = line.toLowerCase().toCharArray();
		char[] upperCase = line.toUpperCase().toCharArray();
		
		char[] lineCase = line.toCharArray();
		int count = 0;
		for(int i = 0;i<lineCase.length;i++) {
			if(lowerCase[i] == lineCase[i]) {
				count++;
			}
		}
		
		System.out.println(count>lineCase.length-count?line.toLowerCase():line.toUpperCase());
		reader.close();
	}

}
