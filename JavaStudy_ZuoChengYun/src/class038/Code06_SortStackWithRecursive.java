package class038;

import java.util.Stack;

public class Code06_SortStackWithRecursive {

	private static void sort(Stack<Integer> stack) {
		int deep = deep(stack);
		while (deep > 0) {
			int max = max(stack, deep);
			int k = times(stack, deep, max);
			down(stack, deep, max, k);
			deep -= k;
		}
	}

	private static int deep(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return 0;
		}
		int num = stack.pop();
		int deep = deep(stack);
		stack.push(num);
		return deep;
	}

	private static int max(Stack<Integer> stack, int deep) {
		if (deep == 0) {
			return Integer.MIN_VALUE;
		}
		int num = stack.pop();
		int restMax = max(stack, deep - 1);
		int max = Math.max(restMax, num);
		stack.push(num);
		return max;
	}

	private static int times(Stack<Integer> stack, int deep, int max) {
		if (deep == 0) {
			return 0;
		}
		int num = stack.pop();
		int restTimes = times(stack, deep - 1, max);
		int times = restTimes + (num == max ? 1 : 0);
		stack.push(num);
		return times;
	}

	private static void down(Stack<Integer> stack, int deep, int max, int k) {
		if (deep == 0) {
			for (int i = 0; i < k; i++) {
				stack.push(max);
			}
		} else {
			int num = stack.pop();
			down(stack, deep - 1, max, k);
			if (num != max) {
				stack.push(num);
			}
		}
	}

	private static Stack<Integer> randomStack(int n, int v) {
		Stack<Integer> ans = new Stack<>();
		for (int i = 0; i < n; i++) {
			ans.add((int) Math.random() * v);
		}
		return ans;
	}

	private static boolean isSorted(Stack<Integer> stack) {
		int step = Integer.MIN_VALUE;
		while (!stack.isEmpty()) {
			if (step > stack.peek()) {
				return false;
			}
			step = stack.pop();
		}
		return true;
	}

	public static void main(String[] args) {
		Stack<Integer> test = new Stack<>();
		test.add(1);
		test.add(5);
		test.add(4);
		test.add(5);
		test.add(3);
		test.add(2);
		test.add(3);
		test.add(1);
		test.add(4);
		test.add(2);
		sort(test);
		while (!test.isEmpty()) {
			System.out.println(test.pop());
		}
		
		int N = 20;
		int V = 20;
		int testTimes = 20000;
		System.out.println("测试开始");
		for(int i = 0;i<testTimes;i++) {
			int n = (int)(Math.random()*N);
			Stack<Integer> stack = randomStack(n, V);
			sort(stack);
			if(!isSorted(stack)) {
				System.out.println("出错了！");
				break;
			}
		}
		System.out.println("测试结束");
	}

}
