package Day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int count = reader.nextInt();
		while (count-- > 0) {

			int nt = reader.nextInt();
			int k = reader.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < nt; i++) {
				int key = reader.nextInt();
				int value = reader.nextInt();
				map.put(key, map.getOrDefault(key, 0) + value);
			}
//			System.out.println(map.size());
			int[] arr = new int[map.size()];
			int i = 0;
			
					
 			for(int key:map.keySet()) {
				arr[i++] = map.get(key);
			}
			
			
			Arrays.sort(arr);
			/*
			for(int num:arr) {
				System.out.print(num+" ");
			}
			 */
			
			
			int totalGroups = 0;

			for (int value : map.values()) {
				totalGroups += value / 3;
			}
//			System.out.println(totalGroups);
			
			if (totalGroups < k) {
				System.out.println("-1");
				break;
			}
			int ans = 0;
			for(int j = 0;j<arr.length;j++) {
//				System.out.println(arr[j]);
				if(arr[j]>k*3) {
					ans+=k*3;
					while(j<arr.length) {
						ans+=2;
						j++;
					}
					break;
				}else {
					ans+=arr[j];
					k-=arr[j]/3;
//					System.out.println(k +"   123");
				}
			}
			if(k==0) {
				System.out.println(ans);
			}else {
				System.out.println("-1");
			}
			
		}
	}

}
