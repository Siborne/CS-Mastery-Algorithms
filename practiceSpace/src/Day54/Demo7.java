package Day54;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String line = reader.nextLine();
		StringBuilder sb = new StringBuilder(line);
		
		
		for(int i = 2;i<sb.length();i++) {
			if(sb.charAt(i)=='B'&&
					sb.charAt(i-1)=='U'&&
					sb.charAt(i-2)=='W') {
				sb.replace(i-2, i+1, " ");
			}
		}
		boolean flag = true;
		StringBuilder res = new StringBuilder();
		for(int i = 0;i<sb.length();i++) {
			if(sb.charAt(i) != ' ') {
				flag = false;
			}
			if(!flag) {
				res.append(sb.charAt(i));
			}
			if(sb.charAt(i)==' ') {
				flag = true;
			}
		}
		System.out.println(res.toString());
		reader.close();
	}
	
}
