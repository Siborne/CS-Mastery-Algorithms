package Day68;

import java.util.Map;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			int[] arr = new int[26];
			reader.nextLine();
			char[] chs = reader.nextLine().toCharArray();
			int last = -1;
			boolean flag = true;
			for(int i = 0;i<chs.length;i++) {
				int temp = chs[i] - 'A';
				if(last!=temp && arr[temp]!=0) {
					flag = false;
					break;
				}
				last = temp;
				arr[temp]++;
			}
			System.out.println(flag?"YES":"NO");
		}
		
		reader.close();
	}
	
}
