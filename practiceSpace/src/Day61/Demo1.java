package Day61;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		reader.nextLine();
		while(t-->0) {
			String line = reader.nextLine();
			char[] chs1 = line.substring(0,3).toCharArray();
			char[] chs2 = line.substring(3,6).toCharArray();
			int sum1 = 0;
			int sum2 = 0;
			for(int i = 0;i<3;i++) {
				sum1+=(chs1[i]-'0');
				sum2+=(chs2[i]-'0');
			}
			if(sum1==sum2) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
		reader.close();
	}
	
}
