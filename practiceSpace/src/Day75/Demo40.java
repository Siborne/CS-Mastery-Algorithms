package Day75;

import java.util.Scanner;

public class Demo40 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		reader.nextLine();
		while(t-->0) {
			char[][] line = new char[8][];
			for(int i = 0;i<line.length;i++) {
				line[i] = reader.nextLine().toCharArray();
			}
			StringBuilder sb = new StringBuilder();
		
			boolean flag = false;
			for(int i = 0;i<line.length;i++) {
				if(flag) {
					break;
				}
				for(int j = 0;j<line[i].length;j++) {
					if(line[i][j]!='.') {
						flag = true;
						for(int k = i;k<line.length;k++) {
							if(line[k][j]=='.') {
								break;
							}
							sb.append(line[k][j]);
						}
					}
				}
			}
			
			System.out.println(sb.toString());
		}
		
		
		reader.close();
	}
	
}
