package Day39;

import java.util.Scanner;

public class Demo11 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] arr = new int[26];
		char[] chs = reader.nextLine().toCharArray();
		for(char ch:chs) {
			arr[ch-'a']++;
		}
		int max = Integer.MIN_VALUE;
		int maxChar = -1;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				maxChar = i;
			}
		}
		System.out.println((char)(maxChar+'a'));
		System.out.println(max);
	}
	
}
