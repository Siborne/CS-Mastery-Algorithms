package Day53;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.nextLine();
		char[] chs = reader.nextLine().toLowerCase().toCharArray();
		int[] arr = new int[26];
		for(char ch:chs) {
			arr[ch - 'a']++;
		}
		boolean flag = true;
		for(int a:arr) {
			if(a==0) {
				flag = false;
				break;
			}
		}
		System.out.println(flag?"YES":"NO");
		reader.close();
	}
	
}
