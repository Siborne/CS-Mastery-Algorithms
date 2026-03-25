package Day69;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			int[] arr = new int[2];
			char[] chs = reader.nextLine().toCharArray();
			for(char ch:chs) {
				arr[ch-'A']++;
			}
			if(arr[0]>arr[1]) {
				System.out.println("A");
			}else {
				System.out.println("B");
			}
		}

		reader.close();
	}

}
