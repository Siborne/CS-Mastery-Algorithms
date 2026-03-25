package s2025;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] chs = reader.nextLine().toCharArray();
		char[] c = new char[26];
		for(char ch:chs) {
			c[ch-'a']++;
		}
		int ans = c['a'-'a']+c['e'-'a']+c['i'-'a']+c['o'-'a']+c['u'-'a'];
		System.out.println(ans);
		reader.close();
	}
	
}
