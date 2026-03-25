package Day63;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.nextLine();
		String now = null;
		int sum = 0;
		while(n-->0) {
			String line = reader.nextLine();
			if(sum==0) {
				 now = line;
				 sum++;
			}else if(line.equals(now)) {
				sum++;
			}else {
				sum--;
			}
		}
		System.out.println(now);
		reader.close();
	}
	
}
