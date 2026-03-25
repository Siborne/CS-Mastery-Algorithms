package Day7;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Long n = reader.nextLong();
		StringBuilder sb = new  StringBuilder();
		while(n>0) {
			sb.append(n%2);
			n/=2;
		}
		sb =sb.reverse();
		while(sb.length()<32) {
			sb.insert(0, "0");
		}
		String str1 = sb.substring(0,16);
		String str2 = sb.substring(16,sb.length());
		String str = str2 + str1;
		long ans = Long.parseLong(str, 2);
        System.out.println(ans);
	}

}
