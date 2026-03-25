package Sort;

import java.util.Scanner;

public class SelectSort {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		selectSort(arr);
		for(int num:arr) {
			System.out.print(num + " ");
		}
	}
	
	public static void selectSort(int[] nums) {
		for(int i = 0;i<nums.length;i++) {
			int min = i;
			for(int j = i+1;j<nums.length;j++) {
				if(nums[j]<nums[min]) {
					min = j;
				}
			}
			swap(nums,min,i);
		}
	}
	
	public static void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
}
