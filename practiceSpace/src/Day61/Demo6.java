package Day61;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] x = new int[100001];
		for(int i = 0;i<n;i++) {
			int temp = reader.nextInt();
			x[temp]++;
		}
		for(int i = 1;i<100001;i++) {
			x[i]+=x[i-1];
		}
		
		int q = reader.nextInt();
		for(int i = 0;i<q;i++) {
			int temp = reader.nextInt();
			if(temp<100000) {
				System.out.println(x[temp]);
			}else {
				System.out.println(n);
			}
			
		}
		
		reader.close();
	}
	
	
}
