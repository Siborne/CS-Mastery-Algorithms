package Sort;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		
		arr = mergeSort(arr,0,arr.length-1);
		for(int num:arr) {
			System.out.print(num+" ");
		}

	}
	
	public static int[] mergeSort(int[] arr,int l,int r) {
		if(l == r) {
			return new int[] {arr[l]};
		}
		
		int mid = (l+r)>>>1;
		int[] left = mergeSort(arr, l, mid);
		int[] right = mergeSort(arr, mid+1, r);
		int[] nums = new int[left.length+right.length];
		int i = 0;
		int j = 0;
		int m = 0;
		while(i<left.length&&j<right.length) {
			nums[m++] = left[i]<right[j]?left[i++]:right[j++];
		}
		while(i<left.length) {
			nums[m++] = left[i++];
		}
		while(j<right.length) {
			nums[m++] = right[j++];
		}
		return nums;
	}

}
