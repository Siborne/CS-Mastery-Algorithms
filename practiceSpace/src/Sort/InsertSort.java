package Sort;

import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		insertSort(arr);
		for(int num:arr) {
			System.out.print(num + " ");
		}
	}
	
	public static void insertSort(int[] nums) {
		for(int i = 1;i<nums.length;i++) {
			int currentMum = nums[i];
			int p = i - 1;
			while(p>=0&&nums[p]>currentMum) {
				nums[p+1] = nums[p];
				p--;
			}
			nums[p+1] = currentMum; 
		}
	}
	
}
