package Day38;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

	private static void solve() {
		long[] arr = new long[20190324];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 3; i < arr.length; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2] + arr[i - 3])%10000;
		}

//		String str = String.valueOf(arr[20190323]);
//		str = str.substring(str.length() - 4);
		System.out.println(arr[arr.length-1]);
	}
}
