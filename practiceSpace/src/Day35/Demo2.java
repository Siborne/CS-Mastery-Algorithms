package Day35;

public class Demo2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i = 1;i<=2020;i++) {
			char[] chs = String.valueOf(i).toCharArray();
			for(int j = 0;j<chs.length;j++) {
				arr[chs[j]-'0']++;
			}
		}
		System.out.println(arr[2]);
	}

}
