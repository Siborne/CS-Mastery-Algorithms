package Day61;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		char[] chs = reader.nextLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<chs.length;i++) {
			if(chs[i]=='.') {
				sb.append(0);
			}else {
				if(chs[i+1] == '.') {
					sb.append(1);
				}else {
					sb.append(2);
				}
				i++;
			}
		}
		System.out.println(sb.toString());
		reader.close();
	}
	
}
