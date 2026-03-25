package Sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		bubbleSort(arr);
		for(int num:arr) {
			System.out.print(num + " ");
		}
	}
	
	public static void bubbleSort(int[] nums) {
		int n = nums.length;
		for(int i = n-1;i>0;i--) {
			boolean swapped = false;
			for(int j = 0;j<i;j++) {
				if(nums[j]>nums[j+1]) {
					swap(nums,j,j+1);
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		
	}
	
	public static void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	

}
