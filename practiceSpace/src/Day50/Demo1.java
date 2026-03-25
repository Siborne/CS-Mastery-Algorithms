package Day50;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		char[] chs1 = reader.nextLine().toLowerCase().toCharArray();
		char[] chs2 = reader.nextLine().toLowerCase().toCharArray();
		
		for(int i = 0;i<chs1.length;i++) {
			if(chs1[i]<chs2[i]) {
				System.out.println(-1);
				return;
			}else if(chs1[i] >chs2[i]) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
		reader.close();
	}

}
