package Day58;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	private static final int MAX = (int) Math.sqrt(1e12) + 1;
	private static boolean[] isPrime = new boolean[MAX];

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		Arrays.fill(isPrime,true);
		isPrime[0] = isPrime[1] = false;
		for(int i = 2;i*i<MAX;i++) {
			if(isPrime[i]) {
				for(int j = i*i;j<MAX;j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		int n = reader.nextInt();
		for(int i = 0;i<n;i++) {
			long x = reader.nextLong();
			long sqrtX = (long)Math.sqrt(x);
			
			if(sqrtX*sqrtX==x&&sqrtX<MAX&&isPrime[(int)sqrtX]) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
	

		reader.close();
	}


}
