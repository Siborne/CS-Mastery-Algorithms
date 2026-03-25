package Day63;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		while(n-->0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			if(a==b) {
				continue;
			}else if(a>b) {
				sum1++;
			}else {
				sum2++;
			}
		}
		
		if(sum1==sum2) {
			System.out.println("Friendship is magic!^^");
		}else if(sum1>sum2) {
			System.out.println("Mishka");
		}else {
			System.out.println("Chris");
		}
		
		reader.close();
	}

}
