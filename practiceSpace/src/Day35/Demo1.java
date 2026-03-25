package Day35;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Arrays.fill(arr, 3);
		int ans = 0;
		while(true) {
			ans++;
			boolean flag = false;
			char[] chs = String.valueOf(ans).toCharArray();
//			System.out.println(n);
			
			for(int i = 0;i<chs.length;i++) {
				int temp = chs[i]-'0';
				if(arr[temp]<=0) {
					flag = true;
					break;
				}
				arr[temp]--;
			}
			for(int num:arr) {
				System.out.print(num+" ");
			}
			System.out.println();
			if(flag) {
				break;
			}
				
		}
		System.out.println(ans-1);
		
		
	}

}
