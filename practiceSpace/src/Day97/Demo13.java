package Day97;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] target = new char[] {'a','e','i','o','u'};
		char[] chs = reader.nextLine().toCharArray();
		int ans = 0;
		for(char ch:chs) {
			for(char t:target) {
				if(ch==t) {
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
		reader.close();
	}
	
}
