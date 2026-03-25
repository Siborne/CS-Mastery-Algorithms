package Day55;

import java.util.Scanner;

public class Demo7 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<m;i++) {
			sb.append(".");
		}
		
		for(int i = 1;i<=n;i++) {
			if(i%2==1) {
				StringBuilder line = new StringBuilder();
				for(int j = 0;j<m;j++) {
					line.append("#");
				}
				System.out.println(line.toString());
			}else if(i%4==2) {
				System.out.println(sb.toString()+"#");
			}else {
				System.out.println("#"+sb.toString());
			}
		}
		
		reader.close();
	}
	
}
