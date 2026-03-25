package Day71;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		reader.nextLine();
		while(t-->0) {
			int ans = 0;
			for(int i = 1;i<=10;i++) {
				char[] chs = reader.nextLine().toCharArray();
				for(int j = 1;j<=10;j++) {
					if (chs[j - 1] == 'X') {
                        int score = Math.min(Math.min(i, 11 - i), Math.min(j, 11 - j));
                        ans += score;
                    }
				}
				
			}
			System.out.println(ans);
		}
		
		reader.close();
	}
	
}
