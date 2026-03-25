package Day85;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int q = reader.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		int index = 0;
		for(int i = 0;i<q;i++) {
			int x = reader.nextInt();
			if(x==1) {
				index++;
				index%=arr.length;
			}else if(x==2) {
				if(index == 0) {
					index = arr.length-1;
				}else {
					index--;
				}
			}
		}
		int temp = 0;
		while(temp++<arr.length) {
			System.out.print(arr[index++]+" ");
			index%=arr.length;
		}
		
		reader.close();
	}
	
}
