package Day54;

import java.util.Scanner;

public class Demo4 {
	
	private static boolean[] flag;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = reader.nextInt();
		}
		int n = reader.nextInt();

		flag = new boolean[n + 1];
		for(int i = 0;i<4;i++) {
			hurtDragon(arr[i], n);
		}
		
		int ans = 0;
		for(int i = 1;i<=n;i++) {
			if(flag[i]) {
				ans++;
			}
		}
		System.out.println(ans);
		reader.close();
	}
	
	private static void hurtDragon(int x,int n) {
		for(int i = x;i<=n;i+=x) {
			flag[i] = true;
		}
	}

}
