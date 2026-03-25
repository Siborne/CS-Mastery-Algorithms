package Day21;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] tree = new int[n];
		for(int i = 0;i<n;i++) {
			tree[i] = reader.nextInt();
		}
		int count = 0;
		for(int i = 1,j=0;i<n;i++) {
			if(tree[i]-tree[j]<m) {
				count++;
			}else {
				j = i;
			}
		}
		System.out.println(n-count);
		reader.close();
	}
	
}
