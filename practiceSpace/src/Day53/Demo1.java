package Day53;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		char[] chs1 = reader.nextLine().toCharArray();
		char[] chs2 = reader.nextLine().toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<chs1.length;i++) {
			if(chs1[i]==chs2[i]) {
				sb.append("0");
			}else {
				sb.append("1");
			}
		}
		System.out.println(sb.toString());
		reader.close();
	}
	
}
