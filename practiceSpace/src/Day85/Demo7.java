package Day85;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			a ^= x&1;
		}
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			b ^= x&1;
		}
		
		if(a == 1&& b==1) {
			System.out.println("odd");
		}else {
			System.out.println("even");
		}
		
		reader.close();
	}
	
}
