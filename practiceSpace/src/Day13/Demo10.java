package Day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Demo10 {

	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner reader = new Scanner(System.in);
		int n = Integer.parseInt(reader.readLine());
		Deque<Integer> stack = new LinkedList<>();
		long ans = 0;
		int[] dp = new int[n + 1];
		StringTokenizer st = new StringTokenizer(reader.readLine());
		for (int i = 1; i <= n; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(x==1) {
				stack.push(i);
			}else if(!stack.isEmpty()){
				dp[i] = dp[stack.pop()-1]+1;
				ans+=dp[i];
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
