package Day62;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		for(int i = 0;i<t;i++) {
			int[] arr = new int[3];
			for(int j = 0;j<3;j++) {
				arr[j]=reader.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[1]);
		}
		
		reader.close();
	}
	
}
