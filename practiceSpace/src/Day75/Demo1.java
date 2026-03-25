package Day75;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String s = reader.nextLine();
		long ans = 0;
		char temp = 'a';
		for(int i = 0;i<s.length();i++) {
			char currentChar = s.charAt(i);
			int diff = Math.abs(temp-currentChar);
			ans += Math.min(diff, 26-diff);
			temp = currentChar;
		}
		
		System.out.println(ans);
		reader.close();
	}
	
}
