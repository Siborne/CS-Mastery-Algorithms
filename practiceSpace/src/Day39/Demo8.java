package Day39;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.close();
		StringBuilder sb = new StringBuilder();
		int i = 1;
		while(sb.length()<=4*n-4) {
			sb.append(i);
			i++;
		}
		for(int j = 0;j<n-1;j++) {
			for(int k = n-j-1;k>0;k--) {
				System.out.print(".");
			}
			System.out.print(sb.charAt(j));
			for(int k= 0;k<2*j-1;k++) {
				System.out.print(".");
			}
			if(j!=0) {
				System.out.print(sb.charAt(sb.length()-j-1));
			}
			System.out.println();
		}
		for(int j = n-1;j<3*n-2;j++) {
			System.out.print(sb.charAt(j));
		}
		
	}

}
