package Day49;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String[] str = reader.nextLine().split("\\+");
		int[] arr = new int[str.length];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		for(int a:arr) {
			sb.append(a).append("+");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
		reader.close();
	}

}
