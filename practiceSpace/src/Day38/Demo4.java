package Day38;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		char[] chs = reader.nextLine().toCharArray();
		int[] digits = new int[26];
		for(char ch : chs) {
			digits[ch-'A']++;
		}
		int max = Integer.MIN_VALUE;
		for(int digit:digits) {
			max = Math.max(digit, max);
		}
		
		for(int i = 0;i<digits.length;i++) {
			if(digits[i]==max) {
				System.out.print((char)(i+'A'));
			}
		}
		
		reader.close();
	}

}
