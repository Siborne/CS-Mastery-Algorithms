package Day42;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long arr[] = new long[60];
//		arr[0] = 1;
//		arr[1] = 1;
//		for (int k = 2; k < arr.length; k++) {
//			arr[k] = arr[k - 1] + arr[k - 2];
//		}
//		System.out.println(Arrays.toString(arr));
		long n = 202202011200L;
		long res = (n / 60) * 8;
		System.out.println(res);
	}

}
