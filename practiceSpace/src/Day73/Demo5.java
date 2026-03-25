package Day73;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String zm = reader.nextLine();
		String line = "qwertyuiopasdfghjkl;zxcvbnm,./";
		char[] chs = line.toCharArray();
		
		char[] input = reader.nextLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<input.length;i++) {
			if(zm.equals("R")) {
				sb.append(chs[line.indexOf(input[i])-1]);
			}else {
				sb.append(chs[line.indexOf(input[i])+1]);
			}
		}
		System.out.println(sb);
		reader.close();
	}
	
}
