package Day63;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			char[] ch1 = reader.next().toCharArray();
			char[] ch2 = reader.next().toCharArray();
			StringBuilder sb1 = new StringBuilder();
			sb1.append(ch2[0]).append(ch1[1]).append(ch1[2]);
			StringBuilder sb2 = new StringBuilder();
			sb2.append(ch1[0]).append(ch2[1]).append(ch2[2]);
			System.out.println(sb1.toString()+" "+sb2.toString());
		}
		
		reader.close();
	}
	
}
