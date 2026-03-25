package Day72;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			long n = reader.nextLong();
			
			for(int i = 2;;i++) {
				long power = quickPow(i, 2);
				long divisor = power - 1;
				
				if(n%divisor == 0) {
					System.out.println(n/divisor);
					break;
				}
			}
			
		}
		
		reader.close();
	}
	
	public static long quickPow(long x,long y) {
		long res = 1L;
		while(x>0) {
			if((x&1)==1) {
				res*=y;
			}
			y*=y;
			x>>=1;
		}
		return res;
	}
	
}
