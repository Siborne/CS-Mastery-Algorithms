package Day97;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		for(int i = 0;i<n;i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = 1;j<=n;j++) {
				sb.append(j);
			}
			System.out.println(sb.toString());
		}
		
		reader.close();
	}
	
}
