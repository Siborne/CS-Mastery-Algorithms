package Day64;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			if((n/2)%2==0) {
				int[] arr = new int[n];
				for(int i = 0;i<n/2;i++) {
					arr[i] = 2*(i+1);
				}
				for(int i = n/2;i<n;i++) {
					if(i<n-n/4) {
						arr[i] = arr[i-n/2]-1;
					}else {
						arr[i] = arr[i-n/2]+1;
					}
				}
				StringBuilder sb = new StringBuilder();
				for(int a:arr) {
					sb.append(a).append(" ");
				}
				System.out.println("YES");
				System.out.println(sb.toString());
			}else {
				System.out.println("NO");
			}
		}
		
		reader.close();
	}
	
}
