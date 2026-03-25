package Day18;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

	public static long[][] arr = new long[30][30];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		long factor = 1;
		factor = (long) Math.pow(2, 30);

		for (int i = 0; i < 29; i++) {
			for (int j = 0; j <= i; j++) {
				long a = reader.nextLong();
				arr[i][j] = a*factor; 
			}
		}
		
		for(int i = 0;i<29;i++) {
			for(int j = 0;j<=i;j++) {
				long ha = arr[i][j]/2;
				arr[i+1][j]+=ha;
				arr[i+1][j+1] +=ha;
			}
		}
		Arrays.sort(arr[29]);
		System.out.println(arr[29][29]/(arr[29][0]/2086458231));
		
		
	}

}
