package class023;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Code01_QuickSort {

	private static int MAXN = 100001;

	private static int[] arr = new int[MAXN];

	private static int n;

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer in = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		in.nextToken();
		n = (int) in.nval;
		for (int i = 0; i < n; i++) {
			in.nextToken();
			arr[i] = (int) in.nval;
		}
		quickSort1(0, n - 1);
		for (int i = 0; i < n - 1; i++) {
			writer.print(arr[i] + " ");
		}
		writer.print(arr[n - 1]);
		writer.flush();
		writer.close();
		reader.close();
	}

	private static void quickSort1(int l, int r) {
		if (l >= r) {
			return;
		}
		int x = arr[l + (int) (Math.random() * (r - l + 1))];
		int mid = partition1(l, r, x);
		quickSort1(l, mid - 1);
		quickSort1(mid + 1, r);
	}

	private static int partition1(int l, int r, int x) {
		int a = l;
		int xi = 0;
		for (int i = l; i <= r; i++) {
			if (arr[i] <= x) {
				swap(a, i);
				if (arr[a] == x) {
					xi = a;
				}
				a++;
			}
		}
		swap(xi, a - 1);
		return a - 1;
	}

	private static void quickSort2(int l, int r) {
		// TODO Auto-generated method stub
		if (l >= r) {
			return;
		}
		int x = arr[l + (int) (Math.random() * (r - l + 1))];
		partition2(l, r, x);
		int left = first;
		int right = last;
		quickSort2(l, left - 1);
		quickSort2(right + 1, r);
	}

	private static int first, last;

	private static void partition2(int l, int r, int x) {
		first = l;
		last = r;
		int i = l;
		while (i <= last) {
			if (arr[i] == x) {
				i++;
			} else if (arr[i] < x) {
				swap(i++, first++);
			} else {
				swap(i, last--);
			}
		}
	}

	private static void swap(int l, int r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}

}
