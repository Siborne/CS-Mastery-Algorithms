package sjjg_cy;

import java.util.Scanner;
import java.util.Stack;

public class Lesson3_T3_2 {

	private static int[] preOrder, inOrder, postOrder;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();

		preOrder = new int[n];
		inOrder = new int[n];

		int preIndex = 0;
		int inIndex = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < 2 * n; i++) {
			String line = reader.nextLine();
			String[] parts = line.split("\\s+");
			if (parts[0].equals("Push")) {
				int x = Integer.parseInt(parts[1]);
				preOrder[preIndex++] = x;
				stack.add(x);
			} else {
				int x = stack.pop();
				inOrder[inIndex++] = x;
			}
		}
		postOrder = new int[n];
		solve(0, 0, 0, n);
		StringBuilder sb = new StringBuilder();
		for (int a : postOrder) {
			sb.append(a).append(" ");
		}
		System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
		reader.close();
	}

	private static void solve(int preL, int inL, int postL, int n) {
		
		if(n==0) {
			return;
		}
		if(n==1) {
			postOrder[postL] = preOrder[preL];
			return;
		}
		
		int root = preOrder[preL];
		postOrder[postL + n - 1] = root;
		int i;
		for (i = 0; i < n; i++) {
			if (inOrder[inL + i] == root) {
				break;
			}
		}
		int leftPartLen = i;
		int rightPartLen = n - leftPartLen - 1;
		
		solve(preL + 1, inL, postL, leftPartLen);
		solve(preL + leftPartLen + 1, inL + leftPartLen + 1, postL + leftPartLen, rightPartLen);
	
	}

}
