package Day73;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int  t = reader.nextInt();
		while(t-->0) {
			int[] arr = new int[3];
			for(int i = 0;i<3;i++) {
				arr[i]=reader.nextInt();
			}
			int n = reader.nextInt();
			Arrays.sort(arr);
			int temp = (arr[2]-arr[1])+(arr[2]-arr[0]);
			if(n>=temp) {
				n-=temp;
				System.out.println(n%3==0?"YES":"NO");
			}else {
				System.out.println("NO");
			}
		}
		
		reader.close();
	}
	
}
