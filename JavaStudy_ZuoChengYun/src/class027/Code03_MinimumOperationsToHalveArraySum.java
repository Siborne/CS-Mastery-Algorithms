package class027;

import java.util.PriorityQueue;

public class Code03_MinimumOperationsToHalveArraySum {

	public int halveArray1(int[] nums) {
		PriorityQueue<Double> heap = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
		double sum = 0;
		for (int num : nums) {
			heap.add((double) num);
			sum += num;
		}
		sum /= 2;
		int ans = 0;
		for (double minus = 0, cur; minus < sum; ans++, minus += cur) {
			cur = heap.poll() / 2;
			heap.add(cur);
		}
		return ans;
	}

	private static int MAXN = 100001;
	private static long[] heap = new long[MAXN];
	private static int size;

	public int halveArray2(int[] nums) {
		size = nums.length;
		long sum = 0;
		for (int i = size - 1; i >= 0; i--) {
			heap[i] = (long) nums[i] << 20;
			sum += heap[i];
			heapify(i);
		}
		sum /= 2;
		int ans = 0;
		for (long minus = 0; minus < sum; ans++) {
			heap[0] /= 2;
			minus += heap[0];
			heapify(0);
		}
		return ans;
	}

	private static void heapify(int i) {
		int l = i * 2 + 1;
		while (l < size) {
			int best = l + 1 < size && heap[l + 1] > heap[l] ? l + 1 : l;
			best = heap[best] > heap[i] ? best : i;
			if (best == i) {
				break;
			}
			swap(best, i);
			i = best;
			l = i * 2 + 1;
		}
	}

	private static void swap(int i, int j) {
		long temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
}
