package Day62;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		for(int i = 1;i<=n;i++) {
			if(pdl(i)&&pdl(n-i)) {
				System.out.println(i+" "+(n-i));
				return;
			}
		}
		
		reader.close();
	}
	
	private static boolean pdl(int x) {
		
		for(int i = 2;i*i<=x;i++) {
			if(x%i==0) {
				return true;
			}
		}
		
		return false;
	}
	
}
