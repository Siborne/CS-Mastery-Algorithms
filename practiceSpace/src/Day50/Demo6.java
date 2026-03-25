package Day50;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		char[] chs = reader.nextLine().toLowerCase().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<chs.length;i++) {
			if(chs[i]=='a'||chs[i]=='o'||chs[i]=='y'||
				chs[i]=='e'||chs[i]=='u'||chs[i]=='i') {
				continue;
			}else {
				sb.append(".").append(chs[i]);
			}
		}
		System.out.println(sb.toString());
		reader.close();
	}
	
}
