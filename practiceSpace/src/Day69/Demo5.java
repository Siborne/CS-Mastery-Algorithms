package Day69;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			reader.nextLine();
			char[] chs = reader.nextLine().toCharArray();
			int sum = 0;
			int ans = 0;
			for(int i = 0;i<chs.length;i++) {
				if(chs[i]=='(') {
					sum++;
				}else{
					sum--;
				}
				if(sum<0) {
					ans++;
					sum=0;
				}
			}
			System.out.println(ans);
			
		}
		
		reader.close();
	}
	
}
