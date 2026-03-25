package Day108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = (int) 1e5 + 10;
	private static final int[] stack = new int[MAXN];
	private static int top = 0;
	private static int q, n;

	private static void push(int x) {
		stack[++top] = x;
	}

	private static int pop() {
		return stack[top--];
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			q = (int) st.nval;
			while (q-- > 0) {
				st.nextToken();
				n = (int) st.nval;

				int[] jin = new int[n + 1];
				int[] chu = new int[n + 1];

				for (int i = 1; i <= n; i++) {
					st.nextToken();
					jin[i] = (int) st.nval;
				}

				for (int i = 1; i <= n; i++) {
					st.nextToken();
					chu[i] = (int) st.nval;
				}
				
				top = 0;
				int js = 1;
				for (int i = 1; i <= n; i++) {
					push(jin[i]);
					
					while (top>0 && stack[top] == chu[js]) {
						pop();
						js++;
					}
				}
				
				if (top==0) {
					writer.println("Yes");
				}else {
					writer.println("No");
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
