package Day59;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int l = reader.nextInt();
		
		double ans = 0;
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = reader.nextInt();
		}
		Arrays.sort(a);
		ans = Math.max(a[0],ans);
		ans = Math.max(l-a[n-1],ans);
		for(int i = 1;i<n;i++) {
			ans = Math.max((a[i]-a[i-1])/2.0,ans);
		}
		System.out.printf("%.10f",ans);
		reader.close();
	}

}
