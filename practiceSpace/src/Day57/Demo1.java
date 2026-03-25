package Day57;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int s = reader.nextInt();
		int n = reader.nextInt();
		Node[] arr = new Node[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new Node(reader.nextInt(), reader.nextInt());
		}

		Arrays.sort(arr, (a, b) -> Integer.compare(a.x, b.x));

		for (Node a : arr) {
			if (s > a.x) {
				s += a.y;
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		reader.close();
	}

	private static class Node {
		int x;
		int y;

		private Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
