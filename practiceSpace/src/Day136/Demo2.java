package Day136;

public class Demo2 {

	static class Solution {

		private static final int MAXN = (int) 1e4 + 1;

		private static int[] stack = new int[MAXN];

		private static int top;

		public static boolean isValid(String s) {
			if (s.isEmpty()) {
				return false;
			}
			int len = s.length();
			char[] chs = s.toCharArray();
			top = 0;
			for (int i = 0; i < len; i++) {
				if (chs[i] == '(' || chs[i] == '{' || chs[i] == '[') {
					push(i);
				} else {
					boolean flag = top > 0 && ((chs[i] == ')' && chs[pop()] == '(')
							|| (chs[i] == '}' && chs[pop()] == '{') || (chs[i] == ']' && chs[pop()] == '['));
					if (!flag) {
						return false;
					}
				}
			}
			return top == 0;
		}

		private static void push(int index) {
			stack[top++] = index;
		}

		private static int pop() {
			return stack[--top];
		}

	}

}
