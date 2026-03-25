package LGR_233_Div4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int k = reader.nextInt();
		int[] arr = new int[n];
		for(int i  =0 ;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		Deque<Integer> stack = new LinkedList<>();
		int a = 0;
		int b = k;
		while(a<k&&b<n) {
			stack.offerLast(arr[a]);
			a++;
			stack.offerLast(arr[b]);
			b++;
		}
		while(a<k) {
			stack.offerLast(arr[a]);
			a++;
		}
		while(b<n) {
			stack.offerLast(arr[b]);
			b++;
		}
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pollFirst()).append(" ");
		}
		System.out.println(sb.substring(0, sb.length()-1)); 
		
		
		reader.close();
	}

}
