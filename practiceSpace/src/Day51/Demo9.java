package Day51;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader  = new Scanner(System.in);
		
		int y = reader.nextInt();
		int ans = y+1;
		while(true) {
			if(test(ans)) {
				break;
			}
			ans++;
		}
		System.out.println(ans);
		reader.close();
	}
	
	private static boolean test(int ans) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		while(ans>0) {
			if(arr[ans%10]!=0) {
				return false;
			}
			arr[ans%10]++;
			ans/=10;
		}
		
		return true;
	}
	
}
