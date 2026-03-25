package Day82;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			String ans = null;
			for(int i = 0;i<3;i++) {
				String line = reader.nextLine();
				if(line.contains("?")) {
//					char[] chs = line.toCharArray();
					if(!line.contains("A")) {
						ans = "A";
					}else if(!line.contains("B")) {
						ans = "B";
					}else {
						ans = "C";
					}
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
