package Day67;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			String line = reader.nextLine();
			int len = line.length();
			if(len%2==1) {
				System.out.println("NO");
			}else {
				boolean flag = true;
				for(int i = 0;i<len/2;i++) {
					if(line.charAt(i)!=line.charAt(i+len/2)) {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
			
		}

		reader.close();
	}

}
