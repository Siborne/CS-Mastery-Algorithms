package class023;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code02_QuickSort2 {

	public int[] sortArray(int[] nums) {

		if (nums.length > 1) {
			quickSort1(nums, 0, nums.length - 1);
//			quickSort2(nums, 0, nums.length-1);
		}

		return nums;
	}

	private static void quickSort1(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		}
		int x = arr[l + (int) (Math.random() * (r - l + 1))];
		int mid = partition1(arr, l, r, x);
		quickSort1(arr, l, mid - 1);
		quickSort2(arr, mid + 1, r);
	}

	private static int partition1(int[] arr, int l, int r, int x) {
		int xi = 0;
		int a = l;
		for (int i = l; i <= r; i++) {
			if (arr[i] <= x) {
				swap(arr, a, i);
				if (arr[a] == x) {
					xi = a;
				}
				a++;
			}
		}
		swap(arr, xi, a - 1);
		return a - 1;
	}

	private static void quickSort2(int[] arr, int l, int r) {
		if (l >= r) {
			return;
		}
		int x = arr[l + (int) (Math.random() * (r - l + 1))];
		partition2(arr, l, r, x);
		int left = first;
		int right = last;
		quickSort2(arr, l, left - 1);
		quickSort2(arr, right + 1, r);
	}

	private static int first, last;

	private static void partition2(int[] arr, int l, int r, int x) {
		first = l;
		last = r;
		int i = l;
		while (i <= last) {
			if (arr[i] == x) {
				i++;
			} else if (arr[i] < x) {
				swap(arr, i++, first++);
			} else {
				swap(arr, i, last--);
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
