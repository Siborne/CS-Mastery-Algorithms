package Day62;

import java.util.Arrays;
import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int[] arr = new int[3];
			for(int i = 0;i<3;i++) {
				arr[i] = reader.nextInt();
			}
			Arrays.sort(arr);
			if(arr[1]+arr[2]>=10) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
		reader.close();
	}
	
}
