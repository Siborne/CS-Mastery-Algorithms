package Day51;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		char[] chs = reader.nextLine().toCharArray();
		char[] target ="hello".toCharArray();
		int j = 0;
		for(int i = 0;i<chs.length;i++) {
			if(j==5) {
				break;
			}
			if(chs[i]==target[j]) {
				j++;
			}
		}
		System.out.println(j==5?"YES":"NO");
		reader.close();
	}
	
}
