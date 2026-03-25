package LGR_233_Div4;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	
	public static void main(String[] args) throws IOException {
//		Scanner reader = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] p = new int[k + 1];
		st = new StringTokenizer(reader.readLine());
		for (int i = 0; i <= k; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}

		int[] left = new int[k];
		int[] right = new int[k];
		for (int i = 0; i < k; i++) {
			left[i] = p[i];
			right[i] = p[i + 1] - 1;
		}

		int[] zone = new int[n + 1]; 
		for (int i = 0; i < k; i++) {
			int start = p[i];
			int end = p[i + 1] - 1;
			for (int j = start; j <= end && j <= n; j++) {
				zone[j] = i + 1;
			}
		}

		int q = Integer.parseInt(reader.readLine());
		
//		StringBuilder sb = new StringBuilder();
		for (int index = 0; index < q; index++) {
			st = new StringTokenizer(reader.readLine());
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			int a = Math.min(i, j);
			int b = Math.max(i, j);

			if (a == b) {
				writer.println("1");
			} else if (zone[a] == zone[b]) {
				writer.println("2");
			} else {
				int l0 = lowerBound(left, a);
				int r0 = upperBound(right, b) - 1;

				int m = 0;
				if (l0 <= r0 && l0 < k && r0 < k) {
					m = r0 - l0 + 1;
				}
				writer.println((2 + m));
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static int lowerBound(int[] arr, int key) {
		int low = 0;
		int high = arr.length;
		while (low < high) {
			int mid = (low + high) / 2;
			if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}

	private static int upperBound(int[] arr, int key) {
		int low = 0;
		int high = arr.length;
		while (low < high) {
			int mid = (low + high) / 2;
			if (arr[mid] <= key) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}

}
