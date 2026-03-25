package chuanzhi_8_chusai;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n  = reader.nextInt();
		int l = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		for (int i : arr) {
			if (l>=i) {
				l++;
			}else {
				break;
			}
		}
		System.out.println(l);
		reader.close();
	}
	
}
