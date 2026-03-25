package Day38;

import java.util.Scanner;

public class Demo12 {

	private static int pos = -1;
	private static String s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		s = reader.nextLine();
		System.out.println(dfs());
		reader.close();
	}

	private static int dfs() {
		int current = 0;
		int max = 0;
		while (pos < s.length() - 1) {
			pos++;
			if(s.charAt(pos)=='(') {
				current+=dfs();
			}else if(s.charAt(pos)=='x') {
				current++;
			}else if(s.charAt(pos)=='|') {
				max = Math.max(current, max);
				current=0;
			}else {
				break;
			}
		}
		return Math.max(max, current);
	}

}
