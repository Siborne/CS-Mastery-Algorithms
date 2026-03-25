package Day51;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader  =new Scanner(System.in);
		
		int n = reader.nextInt();
		int max = 0;
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum = sum - reader.nextInt() + reader.nextInt();
			max = Math.max(max, sum);
		}
		System.out.println(max);
		reader.close();
	}
	
}
