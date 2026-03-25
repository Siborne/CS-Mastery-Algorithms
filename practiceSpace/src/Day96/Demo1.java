package Day96;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int N = reader.nextInt();
		int sum = 0;
		for(int i = 1;i<=N/2+1;i++) {
			if(N%i==0) {
				sum+=i;
			}
		}
		if(N>sum) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		reader.close();
	}
	
}
