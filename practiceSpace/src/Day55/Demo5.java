package Day55;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[] arr = new int[4+1];
		int n = reader.nextInt();
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			arr[x]++;
		}
		
		int ans = arr[4];
		int minGroup3And1 = Math.min(arr[3], arr[1]);
		ans += minGroup3And1;
		arr[3] -= minGroup3And1;
		arr[1] -= minGroup3And1;
		ans+=arr[3];
		ans += (arr[1]+3)/4;
		
		ans += arr[2]/2;
		if(arr[2]%2!=0) {
			ans++;
			if(arr[1]>0) {
				arr[1]--;
				ans--;
			}
		}
		ans += (arr[1] +3)/4;
		
		System.out.println(ans);
		reader.close();
	}
	
}
