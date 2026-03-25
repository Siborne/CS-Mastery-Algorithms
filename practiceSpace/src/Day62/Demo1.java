package Day62;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		
		String target = "codeforces";
		
		while(t-->0) {
			String c = reader.next();
			if(target.contains(c)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
		reader.close();
	}
	
}
